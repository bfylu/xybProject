package com.xyb.ai.service.impl;

import com.xyb.ai.mapper.ai.TMerchantMapper;
import com.xyb.ai.model.ai.TMerchant;
import com.xyb.ai.model.ai.TMerchantExample;
import com.xyb.ai.service.MerDataSynchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSynchServiceImpl implements MerDataSynchService {

    @Autowired
    private TMerchantMapper tMerchantMapper;

    @Override
    public boolean SynchMerData(TMerchant tMerchant) {
        tMerchant.setStatus((short) 1);
        TMerchantExample tMerchantExample = new TMerchantExample();
        TMerchantExample.Criteria criteria = tMerchantExample.createCriteria();
        criteria.andUserIdEqualTo(tMerchant.getUserId());
        criteria.andStatusEqualTo(tMerchant.getStatus());
        List<TMerchant> tMerchants = tMerchantMapper.selectByExample(tMerchantExample);

        //没有这个商户,添加
        if (null==tMerchants||tMerchants.size()==0){
            int i = tMerchantMapper.insertSelective(tMerchant);
            if (1==i){
                return true;
            }
        }
        return false;
    }
}
