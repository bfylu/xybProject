package com.xyb.ai.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.ai.dto.UserAndActionDto;
import com.xyb.ai.mapper.ai.TUserActionMapper;
import com.xyb.ai.model.ai.TUserAction;
import com.xyb.ai.model.ai.TUserActionCount;
import com.xyb.ai.model.ai.TUserActionExample;
import com.xyb.ai.model.xyb.Goods;
import com.xyb.ai.service.GoodsService;
import com.xyb.ai.service.TUserActionCountService;
import com.xyb.ai.service.TUserActionService;
import com.xyb.common.PageInfo;
import com.xyb.common.util.A;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "TUserActionService")
@CacheConfig(cacheNames = "TUserAction")
public class TUserActionServiceImpl implements TUserActionService {

    @Autowired
    private TUserActionMapper tUserActionMapper;

    @Autowired
    private TUserActionCountService tUserActionCountService;

    @Autowired
    private GoodsService goodsService;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public boolean insertSelective(TUserAction record) {
        try {
            Goods goods = new Goods();
            Goods condition = new Goods();
            if (U.isNotBlank(record.getRefNo())) {
                condition.setRefNo(record.getRefNo());
                List<Goods> goodsList = goodsService.findByCondition(condition);
                if (1 > goodsList.size()) {
                    return false;
                }
                goods = A.first(goodsList);
            }
            TUserAction userAction = new TUserAction();
            userAction.setUserId(record.getUserId());
            if (U.isNotBlank(record.getMerCode())) {
                userAction.setMerCode(record.getMerCode());
            } else {
                userAction.setMerCode(null == goods.getMerCode() ? "" : goods.getMerCode());
            }
            userAction.setGoodsName(null == goods.getGoodsName() ? "" : goods.getGoodsName());
            userAction.setRefNo(null == goods.getRefNo() ? "" : goods.getRefNo());
            userAction.setActionState(record.getActionState());
            userAction.setCreateDt(new Date());
            int success = tUserActionMapper.insertSelective(userAction);
            if (1 == success) {
                Map<String, Object> record1 = new HashMap<>();
                record1.put("actionState", record.getActionState());
                record1.put("date", new Date());
                record1.put("openId", record.getUserId());
                if (U.isNotBlank(goods.getRefNo())) {
                    record1.put("refNo", goods.getRefNo());
                }
                TUserActionCount tUserActionCount = tUserActionCountService.selectByCreateDt(record1);
                if (U.isBlank(tUserActionCount)) {
                    TUserActionCount countRecode = new TUserActionCount();
                    countRecode.setUserId(record.getUserId());
                    countRecode.setMerCode(null == goods.getMerCode() ? "" : goods.getMerCode());
                    countRecode.setRefNo(null == goods.getRefNo() ? "" : goods.getRefNo());
                    countRecode.setGoodsName(null == goods.getGoodsName() ? "" : goods.getGoodsName());
                    countRecode.setActionState(record.getActionState());
                    countRecode.setActionCount(1);
                    countRecode.setCreateDt(new Date());
                    countRecode.setUpdateDt(new Date());
                    countRecode.setCreateDate(new Date());
                    tUserActionCountService.insertSelective(countRecode);
                } else {
                    tUserActionCount.setActionCount(null == tUserActionCount.getActionCount() ? 0 : tUserActionCount.getActionCount() + 1);
                    tUserActionCountService.updateByPrimaryKey(tUserActionCount);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return true;
    }

    /**
     * 获取Ai-用户行为记录
     * @param merCode
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<UserAndActionDto> getActionRecord(String merCode, int pageNum, int pageSize) throws UnsupportedEncodingException {
        if (U.isBlank(merCode)){
            return null;
        }

        PageHelper.startPage(pageNum,pageSize);
        List<UserAndActionDto> fieldExtendsTracks = tUserActionMapper.selectTUserActionInfoByMerCode(merCode);

        for (UserAndActionDto fieldExtendsTrack : fieldExtendsTracks) {
            if (U.isNotBlank(fieldExtendsTrack.getNick())){
                String decode = URLDecoder.decode(fieldExtendsTrack.getNick(), "utf-8");
                fieldExtendsTrack.setNick(decode);
            }
            if (U.isNotBlank(fieldExtendsTrack.getActionState())){
                //微信昵称
                String nick = fieldExtendsTrack.getNick().trim();
                //截取商品名称的前8个字符，
                //System.out.println( "浏览次数=" +fieldExtendsTrack.getAction_count());
                String content;
                int num = fieldExtendsTrack.getGoodsName().length();
                if ( num <= 8){
                    content = fieldExtendsTrack.getGoodsName().substring(0,num);
                } else {
                    content = fieldExtendsTrack.getGoodsName().substring(0,8);
                }
                //用户行为状态:0-浏览;1-未支付;2-支付成功;3-取消订单；4-访问店铺；5-分享商品；6-分享小程序店铺；
                if (0==fieldExtendsTrack.getActionState()){
                    System.out.println("str--->>" + content);

                    /**
                     *  按条件查询，查询用户浏览商品的次数，
                     */
                    TUserActionExample tUserActionExample = new TUserActionExample();
                    TUserActionExample.Criteria criteria = tUserActionExample.createCriteria();
                    if (U.isNotBlank(fieldExtendsTrack.getUserId()) && U.isNotBlank(fieldExtendsTrack.getGoodsName())) {
                        criteria.andUserIdEqualTo(fieldExtendsTrack.getUserId());
                        criteria.andGoodsNameEqualTo(fieldExtendsTrack.getGoodsName());
                    }
                    List<TUserAction> tUserActionList = tUserActionMapper.selectByExample(tUserActionExample);

                    fieldExtendsTrack.setContent(nick +"正在浏览商品#sb#\""+ content +"...\"#sb#第" +  tUserActionList.size()  + "次，成交在望");
                }else if (1==fieldExtendsTrack.getActionState()){
                    if (num <= 8) {
                        fieldExtendsTrack.setContent(nick +"下单了商品#sb#\""+ content +"\"#sb#成交在望");
                    } else {
                        fieldExtendsTrack.setContent(nick + "下单了商品#sb#\"" + content + "...\"#sb#成交在望");
                    }
                }else if (2==fieldExtendsTrack.getActionState()){
                    fieldExtendsTrack.setContent(nick +"购买了商品#sb#\""+ content +"...\"#sb#售后很重要");
                }else if (3==fieldExtendsTrack.getActionState()){
                    fieldExtendsTrack.setContent(nick +"取消了商品#sb#\""+ content +"...\"#sb#订单");
                }else if (4 == fieldExtendsTrack.getActionState()) {
                    fieldExtendsTrack.setContent(nick + "查看了您的小程序店铺，看来TA对你的店铺感兴趣");
                }else if (5 == fieldExtendsTrack.getActionState()) {
                    fieldExtendsTrack.setContent(nick + "分享了商品#sb#\"" + content +"...\"#sb#沟通从此开始");
                }else if (6 == fieldExtendsTrack.getActionState()) {
                    fieldExtendsTrack.setContent(nick + "分享了您的小程序店铺，看来TA对你的店铺感兴趣");
                }
                else{
                    continue;
                }
            }
        }
        PageInfo<UserAndActionDto> pageInfo = new PageInfo<>(fieldExtendsTracks);
        return pageInfo;
    }
}
