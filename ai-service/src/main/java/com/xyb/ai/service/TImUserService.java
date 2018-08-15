package com.xyb.ai.service;

import com.xyb.ai.model.ai.TImUser;
import com.xyb.ai.vo.TlsIdAndSigVo;

import java.util.List;

public interface TImUserService {
    List<TImUser> findByUserId(List<String> userId);

    TImUser selectByPrimaryKey(Long id);

    int deleteByPrimaryKey(Long id);

    TImUser insertSelective(TImUser record);

    TImUser updateByPrimaryKey(TImUser record);

    TlsIdAndSigVo accountImportAndReturnSig(String identifier, String nick, String faceUrl) throws Exception;
}
