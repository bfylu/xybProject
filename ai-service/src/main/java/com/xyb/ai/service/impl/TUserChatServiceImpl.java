package com.xyb.ai.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.ai.dto.TChatExtendsTUserTrackDto;
import com.xyb.ai.mapper.ai.TUserChatMapper;
import com.xyb.ai.model.ai.TUserChat;
import com.xyb.ai.model.ai.TUserChatExample;
import com.xyb.ai.service.TUserChatService;
import com.xyb.common.PageInfo;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

@Service(value = "TUserChatService")
@CacheConfig(cacheNames = "TUserChat")
public class TUserChatServiceImpl implements TUserChatService {

    @Autowired
    private TUserChatMapper tUserChatMapper;//这里会报错，但是并不会影响

    @Override
    @Cacheable(key = "#id", unless = "#result == null")
    public TUserChat selectByPrimaryKey(Long id) {
        return tUserChatMapper.selectByPrimaryKey(id);
    }

    @Override
    @CacheEvict(key = "#id")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int deleteByPrimaryKey(Long id) {
        return tUserChatMapper.deleteByPrimaryKey(id);
    }

    @Override
    @CachePut(key = "#result.id", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TUserChat insertSelective(TUserChat record) {
        record.setChatTime(new Date());
        record.setCreateDt(new Date());
        int count = tUserChatMapper.insertSelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    @Override
    @CachePut(key = "#record.id", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TUserChat updateByPrimaryKey(TUserChat record) {
        int count = tUserChatMapper.updateByPrimaryKeySelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    //多条件查询，找出符合条件的记录
    @Override
    public PageInfo<TUserChat> findByCondition(TUserChat record, int pageNum, int pageSize) {
        TUserChatExample tUserChatExample = new TUserChatExample();
        TUserChatExample.Criteria criteria = tUserChatExample.createCriteria();

        tUserChatExample.setOrderByClause(" create_dt");
        if (U.isNotBlank(record.getBuyUserId())) {
            criteria.andBuyUserIdEqualTo(record.getBuyUserId());
        }

        if (U.isNotBlank(record.getMerCode())) {
            criteria.andMerCodeEqualTo(record.getMerCode());
        }

        if (U.isNotBlank(record.getContent())) {
            criteria.andContentEqualTo(record.getContent());
        }

        if (U.isNotBlank(record.getMessageTypeId())) {
            criteria.andMessageTypeIdEqualTo(record.getMessageTypeId());
        }

        if (U.isNotBlank(record.getMsgStatus())) {
            criteria.andMsgStatusEqualTo(record.getMsgStatus());
        }

        if (U.isNotBlank(record.getChatTime())) {
            criteria.andChatTimeEqualTo(record.getChatTime());
        }

        criteria.andStatusEqualTo((short) 1);

        PageHelper.startPage(pageNum, pageSize);
        List<TUserChat> listTUserChat = tUserChatMapper.selectByExample(tUserChatExample);
        PageInfo<TUserChat> pageInfoTUserChat = new PageInfo<>(listTUserChat);

        return pageInfoTUserChat;
    }


    /**
     * 获取AI客户聊天列表
     * @param merCode
     * @param pageNum
     * @param pageSize
     * @return
     */
    /**
     * 获取客户聊天列表
     * @param merCode
     */
    @Override
    public PageInfo<TChatExtendsTUserTrackDto> getMerChatList(String merCode, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<TChatExtendsTUserTrackDto> chatPeopleList = tUserChatMapper.getChatPeopleList(merCode);
        for (TChatExtendsTUserTrackDto tChatExtendsTUserTrackDto : chatPeopleList) {
            String decode = null;
            try {
                decode = URLDecoder.decode(tChatExtendsTUserTrackDto.getNick(), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            tChatExtendsTUserTrackDto.setNick(decode);
        }
        PageInfo<TChatExtendsTUserTrackDto> pageInfo = new PageInfo<>(chatPeopleList);

        return pageInfo;
    }
}
