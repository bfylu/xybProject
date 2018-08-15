package com.xyb.ai.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.ai.dto.UserAndActionCountDto;
import com.xyb.ai.mapper.ai.TUserActionCountMapper;
import com.xyb.ai.model.ai.TUserActionCount;
import com.xyb.ai.service.TUserActionCountService;
import com.xyb.common.PageInfo;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service(value = "TUserActionCountService")
@CacheConfig(cacheNames = "TUserActionCount")
public class TUserActionCountServiceImpl implements TUserActionCountService {

    @Autowired
    private TUserActionCountMapper tUserActionCountMapper;

    @Override
    /*@CachePut(key = "tUserActionCount", unless = "#result == null")*/
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TUserActionCount selectByCreateDt(Map record) {
        TUserActionCount tUserActionCount = tUserActionCountMapper.selectByCreateDt(record);
        return tUserActionCount;
    }

    @Override
    @CachePut(key = "#result.id", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TUserActionCount insertSelective(TUserActionCount record) {
        int count = tUserActionCountMapper.insertSelective(record);
        if (0 == count) {
            return null;
        }
        return record;
    }

    @Override
    @CachePut(key = "#result.id", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TUserActionCount updateByPrimaryKey(TUserActionCount record) {
        int count = tUserActionCountMapper.updateByPrimaryKey(record);
        if (0 == count) {
            return null;
        }
        return record;
    }


    /**
     * 获取访客动态
     * @return
     */
    @Override
    public PageInfo<UserAndActionCountDto> getVisitorDynamic(TUserActionCount tUserActionCount, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserAndActionCountDto> Counts = tUserActionCountMapper.getVisitorDynamic(tUserActionCount.getUserId(), tUserActionCount.getMerCode());

        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        for (UserAndActionCountDto count : Counts) {
            if (U.isNotBlank(count.getUpdateDt())){
                Date updateDt = count.getUpdateDt();
                String date = format.format(updateDt);
                count.setDate(date);
                long time = updateDt.getTime();
                count.setTimeStamp(time);
            }
            //用户行为状态:0-浏览;1-未支付;2-支付成功;3-取消订单；4-访问店铺；5-分享商品；6-分享小程序店铺；7-用户支付商品；8-微信支付商户；9-支付宝支付商户'
            if (U.isNotBlank(count.getActionState())){
                if (0==count.getActionState()){
                    count.setContent("浏览了商品"+count.getGoodsName()+">");
                }else if (1==count.getActionState()){
                    count.setContent("将商品"+count.getGoodsName()+"加入>购物车");
                }else if (2==count.getActionState()){
                    count.setContent("购买了商品"+count.getGoodsName()+">");
                }else if (3==count.getActionState()){
                    count.setContent("取消了商品"+count.getGoodsName()+"订单>");
                }else if (4==count.getActionState()){
                    count.setContent("查看了您的小程序店铺");
                }else if (5==count.getActionState()){
                    count.setContent("分享了商品"+count.getGoodsName());
                }else if (6==count.getActionState()){
                    count.setContent("用户分享了您的小程序店铺");
                }else {
                    continue;
                }
            }
        }

        PageInfo<UserAndActionCountDto> pageInfo = new PageInfo<>(Counts);
        return pageInfo;
    }

}
