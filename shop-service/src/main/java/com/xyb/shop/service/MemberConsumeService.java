package com.xyb.shop.service;

import com.xyb.common.PageInfo;
import com.xyb.shop.dto.MemberConsumeDto;
import com.xyb.shop.model.xyb.MemberConsume;

/**
 * <p>订单表的Service</p>
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/7/18 11:03
 * @email bfyjian@gmail.com
 */
public interface MemberConsumeService {

    PageInfo<MemberConsume> queryOrder(MemberConsumeDto memberConsumeDto, int pageNum, int pageSize);

}
