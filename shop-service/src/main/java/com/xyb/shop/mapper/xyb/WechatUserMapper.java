package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.WechatUser;
import com.xyb.shop.model.xyb.WechatUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatUserMapper {
    long countByExample(WechatUserExample example);

    int deleteByExample(WechatUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatUser record);

    int insertSelective(WechatUser record);

    List<WechatUser> selectByExample(WechatUserExample example);

    WechatUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

    int updateByExample(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

    int updateByPrimaryKeySelective(WechatUser record);

    int updateByPrimaryKey(WechatUser record);
}