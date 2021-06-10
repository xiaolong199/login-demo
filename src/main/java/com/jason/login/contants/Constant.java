/**
 * Copyright(c) Undergo Technology Co.,Ltd.
 * All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Undergo
 * Technology Co.,Ltd. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with Undergo Technology Co.,Ltd.
 * For more information about Undergo, welcome to http://www.runsdata.com
 * <p>
 * project: weixin-java-miniapp-demo
 * <p>
 * Revision History:
 * Date          Version Name    Description
 * 2019/11/25       1.0     liuxl   Creation File
 */
package com.jason.login.contants;

import java.nio.charset.Charset;

/**
 * Description:
 *
 *
 * @author liuxiaolong
 * @date 2019/11/25 14:09
 */
public class Constant {
    public static final String DefultCharsetName = "utf-8";
    public static final Charset DefultCharset = Charset.forName(DefultCharsetName);
    public static final String LineSeparator = System.getProperty("line.separator");
    public static final String HTTPSERVICE_RESULT = "resultCode";
    public static final String HTTPSERVICE_DESCRIPTION = "message";
    public static final String HTTPSERVICE_DATA = "data";
    public static final Integer RESULT_SUCCESS = Integer.valueOf(0);
    public static final Integer RESULT_FAILURE = Integer.valueOf(1);
    public static final String HTTPSERVICE_UNKNOWN = "Unknown error.";
    public static final String PAGE_REQUEST_SIZE = "size";
    public static final String PAGE_REQUEST_PAGE = "page";
    public static final int DEFAULT_PAGE_SIZE = 20;
    public static final String HASH_SALT_VALUE = "He9muMk2V";
    public static final String AES_SECRET_KEY = "N8HblK2%0$5ihB)C";
    public static final String UTC_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
}
