package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.UserCollection;
import com.xyb.shop.model.xyb.UserCollectionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCollectionMapper {
    long countByExample(UserCollectionExample example);

    int deleteByExample(UserCollectionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCollection record);

    int insertSelective(UserCollection record);

    List<UserCollection> selectByExample(UserCollectionExample example);

    UserCollection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCollection record, @Param("example") UserCollectionExample example);

    int updateByExample(@Param("record") UserCollection record, @Param("example") UserCollectionExample example);

    int updateByPrimaryKeySelective(UserCollection record);

    int updateByPrimaryKey(UserCollection record);
}