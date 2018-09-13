package com.ddkgj.common.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author zhongqiuwu
 * @desciption 返回结果类
 * @date 2018/09/04 09:40
 **/
@Getter
@Setter
@ToString
public class Result {
    /**
     * 返回码
     */
    private String resp_code;

    /**
     * 返回描述
     */
    private String resp_message;

    /**
     * 返回结果
     */
    private Object result;

    public Result() {
    }

    public Result(String resp_code, String resp_message, Object result) {
        this.resp_code = resp_code;
        this.resp_message = resp_message;
        this.result = result;
    }

    /**
     * 方法描述:成功无返回值
     *
     * @param
     * @return
     * @author zhongqiuwu
     * @date 2018/9/4 9:49
     */
    public static Result success() {
        return new Result(CommonConstants.SUCCESS, "成功", null);
    }

    /**
     * 方法描述:成功有返回值
     *
     * @param
     * @return
     * @author zhongqiuwu
     * @date 2018/9/4 9:51
     */
    public static Result success(Object result) {
        return new Result(CommonConstants.SUCCESS, "成功", result);
    }

    /**
     * 方法描述:失败返回失败信息，无返回值
     *
     * @param message 失败信息
     * @return
     * @author zhongqiuwu
     * @date 2018/9/4 9:55
     */
    public static Result fail(String message) {
        return new Result(CommonConstants.FALIED, message, null);
    }

    /**
     * 方法描述:失败返回失败信息，有返回值
     *
     * @param message 失败信息
     * @param result 返回值
     * @return
     * @author zhongqiuwu
     * @date 2018/9/4 9:55
     */
    public static Result fail(String message, Object result) {
        return new Result(CommonConstants.FALIED, message, result);
    }
}
