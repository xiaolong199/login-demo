/**
 * Copyright(c) Jinghong Technology Co.,Ltd.
 * All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Jinghong
 * Technology Co.,Ltd. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with Jinghong Technology Co.,Ltd.
 * For more information about Jinghong, welcome to https://www.imagego.com
 * <p>
 * Revision History:
 * Date         Version     Name                Description
 * 2020-11-11   1.0         Jason.Liu           Generated automatically
 */
package com.jason.login.contants;

/**
 * @description:
 * @author: Jason.Long
 * @create: 2020-11-11 11:58
 **/
public enum ErrorCode {
    USER_PANEL_NOT_EXIST(0X000150003,"User date monitor panel not exist!","用户数据监控模板不存在","v1.0"),
    REMOTE_SERVICE_ERROR(0X000150005,"Remote server error","远程服务异常","v1.0"),
    PANEL_CODE_NOT_EXIST(0X000150007,"Data monitor code not exist!","数据模板不存在","v1.0"),
    PANEL_CODE_NOT_EXIST_WITH_ID(0X000150007,"Data monitor code not exist!","id为${id}数据模板不存在","v1.0");

    /**
     * The error code indicates which problem occurs.
     */
    private int code;
    /**
     * The description of error for developers.
     */
    private String value;
    /**
     * Pretty Message to present to the user.
     */
    private String message;

    private String version;

    ErrorCode(int code, String value, String message, String version) {
        this.code = code;
        this.value = value;
        this.message = message;
        this.version = version;
    }

    public static String parseCode(Integer code, String defaultValue) {
        if (code == null) {
            return defaultValue;
        }
        for (ErrorCode value : ErrorCode.values()) {
            if (value.code == code) {
                return value.value;
            }
        }
        return defaultValue;
    }

    public int getCode() {
        return code;
    }


    public String getValue() {
        return value;
    }


    public String getMessage() {
        return message;
    }

    public String getVersion() {
        return version;
    }
}
