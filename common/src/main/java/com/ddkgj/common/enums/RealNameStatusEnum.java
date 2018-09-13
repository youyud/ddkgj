package com.ddkgj.common.enums;

/**
 * @author zhongqiuwu
 * @desciption 实名认证状态
 * @date 2018/09/04 11:28
 **/
public enum RealNameStatusEnum {

    AUDIT("0","审核中"),
    PASS("1","审核通过"),
    REJECT("2","审核未通过"),
    NOT_FILED("3","未提交审核资料");

    private String code;
    private String message;

    RealNameStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
