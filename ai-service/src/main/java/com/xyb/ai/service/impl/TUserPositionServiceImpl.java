package com.xyb.ai.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.ai.common.MapDistance;
import com.xyb.ai.dto.PeopleCountDto;
import com.xyb.ai.dto.RelativePositionDto;
import com.xyb.ai.dto.TUserPositionDto;
import com.xyb.ai.dto.UserAndActionDto;
import com.xyb.ai.mapper.ai.TMerchantMapper;
import com.xyb.ai.mapper.ai.TUserActionCountMapper;
import com.xyb.ai.mapper.ai.TUserPositionMapper;
import com.xyb.ai.model.ai.TMerchant;
import com.xyb.ai.model.ai.TMerchantExample;
import com.xyb.ai.model.ai.TUserPosition;
import com.xyb.ai.service.TUserPositionService;
import com.xyb.common.PageInfo;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Service
public class TUserPositionServiceImpl implements TUserPositionService {
    private Logger log = LogManager.getLogger(getClass());

    @Autowired
    private TUserActionCountMapper tUserActionCountMapper;

    @Autowired
    private TMerchantMapper tMerchantMapper;

    @Autowired
    private TUserPositionMapper tUserPositionMapper;

    /**
     * 获取在线人数和总人数
     * @param merCode
     * @return
     */
    @Override
    public PeopleCountDto getPeopleCount(String merCode, String distance) {
        long count = tUserActionCountMapper.getPeopleCount(merCode);//获取总人数

        //获取商家的经纬度
        TMerchantExample tMerchantExample = new TMerchantExample();
        TMerchantExample.Criteria criteria = tMerchantExample.createCriteria();
        criteria.andUserIdEqualTo(merCode);
        List<TMerchant> list = tMerchantMapper.selectByExample(tMerchantExample);
        if (null==list||list.size()==0){
            return null;
        }
        TMerchant tMerchant = list.get(0);
        if (U.isBlank(tMerchant.getLatitude())||U.isBlank(tMerchant.getLongitude())){
            log.info("商户坐标为空,无法获取商户周边的在线人数");
            return null;
        }
/*
        //获取经纬度范围的在线人数
        Map around = MapDistance.getAround(tMerchant.getLatitude().toString(), tMerchant.getLongitude().toString(), distance);
        String maxLng = (String) around.get("maxLng");
        String minLng = (String) around.get("minLng");
        String maxLat = (String) around.get("maxLat");
        String minLat = (String) around.get("minLat");
        //获取在线人数
        long onLinePeopleCount = tUserPositionMapper.getOnLinePeopleCount(new BigDecimal(maxLat),
                new BigDecimal(minLat), new BigDecimal(maxLng), new BigDecimal(minLng));
*/
        //获取看过商家商品的在线人数
        long onLinePeopleCount = tUserPositionMapper.getOnLinePeopleCount(merCode);

        PeopleCountDto peopleCountDto = new PeopleCountDto();
        peopleCountDto.setPeopleCount(count);
        peopleCountDto.setOnLinePeopleCount(onLinePeopleCount);
        log.info("店铺潜在客户人数-->"+peopleCountDto.getPeopleCount()+";店铺周边在线人数-->"+peopleCountDto.getOnLinePeopleCount());
        return peopleCountDto;
    }


    /**
     * AI-获取商户周边用户
     * @param userId   商户id
     * @param distance 距离
     * @return
     */
    @Override
    public RelativePositionDto getRelativePosition(String userId, String distance) {
        //获取商家的经纬度
        TMerchantExample tMerchantExample = new TMerchantExample();
        TMerchantExample.Criteria criteria = tMerchantExample.createCriteria();
        if (U.isNotBlank(userId)){
            criteria.andUserIdEqualTo(userId);
        }
        List<TMerchant> list = tMerchantMapper.selectByExample(tMerchantExample);

        if (null==list||list.size()==0){
            log.info("没有找到商家信息");
            return null;
        }
        TMerchant tMerchant = list.get(0);
        if (U.isBlank(tMerchant.getLatitude())||U.isBlank(tMerchant.getLongitude())){
            log.info("商家坐标为空,无法定位获取周边客户");
            return null;
        }
        Map around = MapDistance.getAround(tMerchant.getLatitude().toString(), tMerchant.getLongitude().toString(), distance);

        String maxLng = (String) around.get("maxLng");
        String minLng = (String) around.get("minLng");
        String maxLat = (String) around.get("maxLat");
        String minLat = (String) around.get("minLat");

        //根据经纬度查询周边用户
        List<TUserPosition> positions = tUserPositionMapper.getAroundCustomer(new BigDecimal(maxLat),
                new BigDecimal(minLat), new BigDecimal(maxLng), new BigDecimal(minLng));
        for (TUserPosition position : positions) {
            if (U.isBlank(position.getNick())){
                continue;
            }
            String decode=null;
            try {
                decode = URLDecoder.decode(position.getNick(), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            position.setNick(decode);
        }
        List<TUserPositionDto> tUserPositionDtos = JsonUtil.convertList(positions, TUserPositionDto.class);

        //封装数据
        RelativePositionDto dto = new RelativePositionDto();
        dto.setTMerchant(tMerchant);
        dto.setList(tUserPositionDtos);
        return dto;
    }


    /**
     * AI-获取客户列表
     * @param merCode
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<UserAndActionDto> getCustomerList(String merCode, int pageNum, int pageSize,int screen) {

        TMerchantExample tMerchantExample = new TMerchantExample();
        TMerchantExample.Criteria criteria = tMerchantExample.createCriteria();
        criteria.andUserIdEqualTo(merCode);
        List<TMerchant> tMerchants = tMerchantMapper.selectByExample(tMerchantExample);
        if (null==tMerchants||tMerchants.size()==0){
            log.info("没有找到商户信息");
            return null;
        }
        TMerchant tMerchant = tMerchants.get(0);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        PageHelper.startPage(pageNum,pageSize);
        List<TUserPosition> tUserPositions = tUserPositionMapper.selectCustomerList(merCode);
        List<UserAndActionDto> userAndActionDtos = JsonUtil.convertList(tUserPositions, UserAndActionDto.class);
        for (UserAndActionDto userAndActionDto : userAndActionDtos) {
            //转换昵称
            if (U.isNotBlank(userAndActionDto.getNick())){
                String decode = null;
                try {
                    decode = URLDecoder.decode(userAndActionDto.getNick(), "utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                userAndActionDto.setNick(decode);
            }
            //计算距离
            if (U.isNotBlank(tMerchant.getLatitude())&&U.isNotBlank(tMerchant.getLongitude())&&
                    U.isNotBlank(userAndActionDto.getLatitude())&&U.isNotBlank(userAndActionDto.getLongitude())){

                String distance = MapDistance.getDistance(tMerchant.getLatitude().toString(), tMerchant.getLongitude().toString(),
                        userAndActionDto.getLatitude().toString(), userAndActionDto.getLongitude().toString());
                userAndActionDto.setDistance(distance);
            }else{
                userAndActionDto.setDistance(null);
            }
            //转换时间
            if (U.isNotBlank(userAndActionDto.getUpdateDt())){
                String setActivityDate = format.format(userAndActionDto.getUpdateDt());
                userAndActionDto.setActivityDate(setActivityDate);
            }
        }

        //表示按距离排序
        if (4==screen){
            Collections.sort(userAndActionDtos, new Comparator<UserAndActionDto>() {
                @Override
                public int compare(UserAndActionDto o1, UserAndActionDto o2) {
                    BigDecimal subtract = new BigDecimal(o1.getDistance()).subtract(new BigDecimal(o2.getDistance()));
                    int i = subtract.intValue();
                    return i;
                }
            });
        }

        PageInfo<TUserPosition> pageInfo = new PageInfo<>(tUserPositions);
        PageInfo<UserAndActionDto> pageInfoDto = JsonUtil.convert(pageInfo, UserAndActionDto.class);
        pageInfoDto.setList(userAndActionDtos);
        return pageInfoDto;
    }


    /**
     * AI-获取用户最新信息详情
     * @param id
     * @return
     */
    @Override
    public UserAndActionDto getCustomerInfo(String id, String merCode) {
        //获取最新的客户信息
        TUserPosition tUserPosition = tUserPositionMapper.getNewCustomerINfo(id,merCode);
        if (null==tUserPosition){
            log.info("没有找到用户信息");
            return  null;
        }
        //查询商户经纬度,用于计算距离
        TMerchantExample tMerchantExample = new TMerchantExample();
        TMerchantExample.Criteria criteria1 = tMerchantExample.createCriteria();
        criteria1.andUserIdEqualTo(merCode);
        List<TMerchant> tMerchants = tMerchantMapper.selectByExample(tMerchantExample);
        if (null==tMerchants||tMerchants.size()==0){
            return  null;
        }
        TMerchant tMerchant = tMerchants.get(0);
        if (U.isBlank(tMerchant.getLatitude())||U.isBlank(tMerchant.getLongitude())){
            return null;
        }
        String distance=null;
        UserAndActionDto convert = JsonUtil.convert(tUserPosition, UserAndActionDto.class);
        if (U.isNotBlank(tUserPosition.getLatitude()) && U.isNotBlank(tUserPosition.getLongitude())) {
            distance = MapDistance.getDistance(tUserPosition.getLatitude().toString(), tUserPosition.getLongitude().toString(),
                    tMerchant.getLatitude().toString(), tMerchant.getLongitude().toString());
        }
        convert.setDistance(distance);
        String decode=null;
        if (U.isNotBlank(convert.getNick())){
            try {
                decode = URLDecoder.decode(convert.getNick(), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            convert.setNick(decode);
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (U.isNotBlank(convert.getUpdateDt())){
            String date = format.format(convert.getUpdateDt());
            convert.setActivityDate(date);
        }
        return convert;
    }
}
