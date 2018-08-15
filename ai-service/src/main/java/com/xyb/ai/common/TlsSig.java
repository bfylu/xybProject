package com.xyb.ai.common;

import com.tls.tls_sigature.tls_sigature;
import com.xyb.ai.vo.TlsIdAndSigVo;
import com.xyb.common.util.HttpRequst;
import com.xyb.common.util.U;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;

@Component
public class TlsSig {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Value("${tls.sdkAppid}")
    private Integer sdkAppid;

    @Value("${tls.private-key}")
    private String privateKey;

    @Value("${tls.public-key}")
    private String publicKey;

    @Value("${tls.admin-Account}")
    private String adminAccount;

    public String genTlsSig(String identifier) throws IOException {
        File priKeyFile = new File(privateKey);
        StringBuilder strBuilder = new StringBuilder();
        String s = "";

        BufferedReader br = new BufferedReader(new FileReader(priKeyFile));
        while ((s = br.readLine()) != null) {
            strBuilder.append(s + '\n');
        }
        br.close();
        String priKey = strBuilder.toString();
//        log.info("priKey:" + priKey);

        // generate signature
        tls_sigature.GenTLSSignatureResult result = tls_sigature.GenTLSSignatureEx(sdkAppid, identifier, priKey);
        if (0 == result.urlSig.length()) {
            log.error("GenTLSSignatureEx failed: " + result.errMessage);
            return "";
        }

        return result.urlSig;
    }

    public boolean checkTlsSig(String identifier, String strSig) throws Exception {
        File pubKeyFile = new File(publicKey);

        BufferedReader br = new BufferedReader(new FileReader(pubKeyFile));
        StringBuilder strBuilder = new StringBuilder();
        String s = "";
        while ((s = br.readLine()) != null) {
            strBuilder.append(s + '\n');
        }
        br.close();

        String pubKey = strBuilder.toString();

        // check signature
        tls_sigature.CheckTLSSignatureResult checkResult = tls_sigature.CheckTLSSignatureEx(strSig, sdkAppid, identifier, pubKey);
        if (checkResult.verifyResult == false) {
            log.error("CheckTLSSignature failed: " + checkResult.errMessage);
            return false;
        }

        log.info("\ncheck sig ok -- expire time " + checkResult.expireTime + " -- init time " + checkResult.initTime + "\n---\n");

        return true;
    }

    public boolean accountImport(String identifier, String nick, String faceUrl) throws Exception {
        String strSig = genTlsSig(adminAccount);

        U.assertException(U.isBlank(strSig), "TLS签名为空值!");

        String rand = String.valueOf(System.currentTimeMillis());

        String account_import_url = MessageFormat.format(Constants.ACCOUNT_IMPORT, strSig, adminAccount, sdkAppid.toString(), rand);

        log.info("account_import_url:" + account_import_url);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Identifier", identifier);
        jsonObject.put("Nick", nick);
        jsonObject.put("FaceUrl", faceUrl);

        String strBody = jsonObject.toString();
        String result = HttpRequst.httpRequestReturn(account_import_url, strBody);

        JSONObject jsonResult = new JSONObject(result);
        U.assertNil(jsonResult, "TLS导入账号返回为空值!");

        U.assertException(!jsonResult.get("ErrorCode").toString().equals("0"), "TLS导入账号失败");

        log.info("return result:" + jsonResult.toString());

        return true;
    }

    public TlsIdAndSigVo accountImportAndReturnSig(String identifier, String nick, String faceUrl) throws Exception {
        String strAdminSig = genTlsSig(adminAccount);
        U.assertException(U.isBlank(strAdminSig), "TLS admin 签名为空值!");

        String rand = String.valueOf(System.currentTimeMillis());

        String account_import_url = MessageFormat.format(Constants.ACCOUNT_IMPORT, strAdminSig, adminAccount, sdkAppid.toString(), rand);

        log.info("account_import_url:" + account_import_url);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Identifier", identifier);
        jsonObject.put("Nick", nick);
        jsonObject.put("FaceUrl", faceUrl);

        String strBody = jsonObject.toString();
        String result = HttpRequst.httpRequestReturn(account_import_url, strBody);

        JSONObject jsonResult = new JSONObject(result);
        U.assertNil(jsonResult, "TLS导入账号返回为空值!");

        U.assertException(!jsonResult.get("ErrorCode").toString().equals("0"), "TLS导入账号失败");

        log.info("return result:" + jsonResult.toString());

        String strSig = genTlsSig(identifier);
        U.assertException(U.isBlank(strAdminSig), "TLS 签名为空值!");

        TlsIdAndSigVo tlsIdAndSigVo = new TlsIdAndSigVo();
        tlsIdAndSigVo.setIdentifier(identifier);
        tlsIdAndSigVo.setUsersig(strSig);

        return tlsIdAndSigVo;
    }
}