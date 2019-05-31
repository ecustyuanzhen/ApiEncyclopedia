package com.cmb.ApiEncyclopedia.rest;

import org.springframework.util.StringUtils;

/**
 * Created by SENSETIME\yuanzhen on 19-5-31 下午3:50
 */
public enum RestEnum {

    /* 公用 */
    SUCCESS("200","success"),
    FAILED("500","failed");

    private final String code;
    private final String msg;

    RestEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static RestEnum getByCode(String code){
        if(!StringUtils.isEmpty(code)){
            for (RestEnum restEnum:values()){
                if(restEnum.getCode().equals(code)){
                    return restEnum;
                }
            }
        }
        return null;
    }
}
