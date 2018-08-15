package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.InstallmentAppletsOrder;
import com.xyb.shop.model.xyb.InstallmentAppletsOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InstallmentAppletsOrderMapper {
    long countByExample(InstallmentAppletsOrderExample example);

    int deleteByExample(InstallmentAppletsOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InstallmentAppletsOrder record);

    int insertSelective(InstallmentAppletsOrder record);

    List<InstallmentAppletsOrder> selectByExampleWithBLOBs(InstallmentAppletsOrderExample example);

    List<InstallmentAppletsOrder> selectByExample(InstallmentAppletsOrderExample example);

    InstallmentAppletsOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InstallmentAppletsOrder record, @Param("example") InstallmentAppletsOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") InstallmentAppletsOrder record, @Param("example") InstallmentAppletsOrderExample example);

    int updateByExample(@Param("record") InstallmentAppletsOrder record, @Param("example") InstallmentAppletsOrderExample example);

    int updateByPrimaryKeySelective(InstallmentAppletsOrder record);

    int updateByPrimaryKeyWithBLOBs(InstallmentAppletsOrder record);

    int updateByPrimaryKey(InstallmentAppletsOrder record);
}