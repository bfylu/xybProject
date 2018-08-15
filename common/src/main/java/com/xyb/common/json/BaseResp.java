package com.xyb.common.json;

import com.fasterxml.jackson.annotation.JsonInclude;

@SuppressWarnings("unchecked")
public class BaseResp<T> {
    /**
     * 返回码
     */
    private int code;

    /**
     * 返回信息描述
     */
    private String message;

    /** 返回的数据. 实体 {"id":1} 还是列表 [{"id":1},{"id":2}] 依业务而定 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    private long currentTime;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public BaseResp() {
    }

    /**
     * @param code    错误码
     * @param message 信息
     * @param data    数据
     */
    public BaseResp(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * 带数据的返回结果
     *
     * @param resultStatus
     * @param data
     */
    public BaseResp(ResultStatus resultStatus, T data) {
        this.code = resultStatus.getErrorCode();
        this.message = resultStatus.getErrorMsg();
        this.data = data;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * 有 msg 说明的成功. 不返回数据, 当返回 "添加成功" 这一类时
     */
    public static <T> BaseResp<T> success(String msg) {
        return new BaseResp(ResultStatus.SUCCESS, msg);
    }

    /**
     * 成功且有返回数据. 也应该给一个 msg 说明
     */
    public static <T> BaseResp<T> success(String msg, T data) {
        return new BaseResp(ResultStatus.SUCCESS.getErrorCode(), msg, data);
    }

    /**
     * 失败时要有 msg 说明. 要对用户友好, 可以直接显示给用户看的
     */
    public static <T> BaseResp<T> fail(String msg) {
        return new BaseResp(ResultStatus.FAIL, msg);
    }
}