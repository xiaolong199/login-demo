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
 * 2019/11/1       1.0     liuxl   Creation File
 */
package com.jason.login.httpResponse;


import com.jason.login.contants.Constant;
import com.jason.login.contants.ErrorCode;

import java.util.Map;

/**
 * Description:
 *
 *
 * @author liuxiaolong
 * @date 2019/11/1 20:10
 */
public class HttpResponse<T> {

    private Integer resultCode;
    private String message;
    private T data;
    private Map<String, String> localizedMessageParameters;
    private Object accessory;
    /*private Map<String, Object> values;
    private JsonGenerator generator;
    public HttpResponse(Integer resultcode){
        this.append(Constant.HTTPSERVICE_RESULT, resultcode);
    }
    public HttpResponse(){
        this(Constant.RESULT_SUCCESS);
    }
    public HttpResponse(String message){
        this.append(Constant.HTTPSERVICE_RESULT, Constant.RESULT_FAILURE)
                .append(Constant.HTTPSERVICE_DESCRIPTION, message);
    }

    public HttpResponse setMessage(String message){
        return this.append(Constant.HTTPSERVICE_DESCRIPTION, message);
    }
    public HttpResponse setErrorMessage(String message){
        return setMessage(Constant.RESULT_FAILURE,message);
    }
    public HttpResponse setErrorMessage(Integer errorCode,String message){
        return append(Constant.HTTPSERVICE_RESULT,errorCode)
                .append(Constant.HTTPSERVICE_DESCRIPTION, message);
    }
    public HttpResponse setData(Object data){
        return append(Constant.HTTPSERVICE_DATA, data);
    }
    public void setResultcode(Integer resultcode){
        append(Constant.HTTPSERVICE_RESULT,resultcode);
    }

    private HttpResponse append(String key, Object value) {
        if (values == null)
            values = new HashMap<String, Object>();
        values.put(key, value);
        return this;
    }

    public String toString(){
        ByteArrayOutputStream  out = new ByteArrayOutputStream();
        if (generator == null) {
            try {
                generator = (new JsonFactory()).createGenerator(out);
                generator.writeObject(this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return out.toString();
    }*/
    public static final HttpResponse<?> SUCCESS = HttpResponse.of(Constant.RESULT_SUCCESS);
    public static final HttpResponse<?> FAILURE = HttpResponse.of(Constant.RESULT_FAILURE);

    public static<T> HttpResponse<T> of(){
        return new HttpResponse<T>(Constant.RESULT_SUCCESS);
    }
    public static<T> HttpResponse<T> of(Integer code, String errorMessage){
        return new HttpResponse<T>(code).setErrorMessage(errorMessage);
    }
    public static<T> HttpResponse<T> of(Integer code, String errorMessage, Map<String, String> localizedMessageParameters){
        return new HttpResponse<T>(code).setErrorMessage(errorMessage).setLocalizedMessageParameters(localizedMessageParameters);
    }


    public static<T> HttpResponse<T> of(T data){
        return new HttpResponse<T>(Constant.RESULT_SUCCESS).setData(data);
    }

    public HttpResponse(Integer resultCode){
        this.resultCode = resultCode;
    }
    public HttpResponse(){
        this(Constant.RESULT_SUCCESS);
    }
    public HttpResponse(String errorMessage){
        setErrorMessage(errorMessage);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpResponse<T> setErrorMessage(String message){
        return setErrorMessage(Constant.RESULT_FAILURE, message);
    }
    public HttpResponse<T> setErrorMessage(Integer errorCode, String message){
        this.resultCode = errorCode;
        this.message = message;
        return this;
    }
    public HttpResponse<T> setData(T data){
        this.data = data;
        return this;
    }
    public HttpResponse<T> setResultCode(Integer resultCode){
        this.resultCode = resultCode;
        return this;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public Object getAccessory() {
        return accessory;
    }

    public void setAccessory(Object accessory) {
        this.accessory = accessory;
    }

    public Map<String, String> getLocalizedMessageParameters() {
        return localizedMessageParameters;
    }

    public HttpResponse<T> setLocalizedMessageParameters(Map<String, String> localizedMessageParameters) {
        this.localizedMessageParameters = localizedMessageParameters;
        return this;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "resultCode=" + resultCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", accessory=" + accessory +
                '}';
    }
}
