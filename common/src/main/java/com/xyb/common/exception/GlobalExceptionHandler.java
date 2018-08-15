package com.xyb.common.exception;

import com.xyb.common.json.BaseResp;
import com.xyb.common.json.ResultStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(annotations = {RestController.class})
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 系统异常处理，比如：404,500
     *
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResp<?> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {

        logger.error("", e);
        BaseResp baseResp = new BaseResp();
        baseResp.setMessage(e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            baseResp.setCode(ResultStatus.http_status_not_found.getErrorCode());
        } else {
            baseResp.setCode(ResultStatus.http_status_internal_server_error.getErrorCode());
        }
        baseResp.setData("");
        baseResp.setCurrentTime(System.currentTimeMillis());
        return baseResp;
    }
}