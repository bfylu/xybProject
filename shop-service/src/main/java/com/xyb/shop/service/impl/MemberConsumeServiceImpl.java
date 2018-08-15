package com.xyb.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.common.PageInfo;
import com.xyb.common.util.U;
import com.xyb.shop.dto.MemberConsumeDto;
import com.xyb.shop.mapper.xyb.MemberConsumeMapper;
import com.xyb.shop.model.xyb.MemberConsume;
import com.xyb.shop.model.xyb.MemberConsumeExample;
import com.xyb.shop.service.MemberConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>订单表的Service实现</p>
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/7/18 11:16
 * @email bfyjian@gmail.com
 */
@Service(value = "MemberConsumeService")
@CacheConfig(cacheNames = "MemberConsume")
public class MemberConsumeServiceImpl implements MemberConsumeService {

    @Autowired
    private MemberConsumeMapper memberConsumeMapper;

    @Override
    public PageInfo<MemberConsume> queryOrder(MemberConsumeDto memberConsumeDto,int pageNum, int pageSize) {

        MemberConsumeExample memberConsumeExample = new MemberConsumeExample();
        MemberConsumeExample.Criteria criteria = memberConsumeExample.createCriteria();
        if (U.isNotBlank(memberConsumeDto.getOrderNo())) {
            criteria.andOrderNoEqualTo(memberConsumeDto.getOrderNo());
        }
        if (U.isNotBlank(memberConsumeDto.getBuyerUsername())) {
            criteria.andBuyerUsernameEqualTo(memberConsumeDto.getBuyerUsername());
        }
        if (U.isNotBlank(memberConsumeDto.getUserPhone())) {
            criteria.andUserPhoneEqualTo(memberConsumeDto.getUserPhone());
        }
        if (U.isNotBlank(memberConsumeDto.getSellerMerCode())) {
            criteria.andSellerMerCodeEqualTo(memberConsumeDto.getSellerMerCode());
        }

        //开始分页
        PageHelper.startPage(pageNum, pageSize);
        List<MemberConsume> memberConsumeList = memberConsumeMapper.selectByExample(memberConsumeExample);
        PageInfo<MemberConsume> pageInfoTUser = new PageInfo<>(memberConsumeList);
        return pageInfoTUser;
    }
}
