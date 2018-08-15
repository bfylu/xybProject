package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.InstallmentAppletsOrderDetail;
import com.xyb.ai.model.xyb.InstallmentAppletsOrderDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InstallmentAppletsOrderDetailMapper {
    long countByExample(InstallmentAppletsOrderDetailExample example);

    int deleteByExample(InstallmentAppletsOrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InstallmentAppletsOrderDetail record);

    int insertSelective(InstallmentAppletsOrderDetail record);

    List<InstallmentAppletsOrderDetail> selectByExample(InstallmentAppletsOrderDetailExample example);

    InstallmentAppletsOrderDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InstallmentAppletsOrderDetail record, @Param("example") InstallmentAppletsOrderDetailExample example);

    int updateByExample(@Param("record") InstallmentAppletsOrderDetail record, @Param("example") InstallmentAppletsOrderDetailExample example);

    int updateByPrimaryKeySelective(InstallmentAppletsOrderDetail record);

    int updateByPrimaryKey(InstallmentAppletsOrderDetail record);
}