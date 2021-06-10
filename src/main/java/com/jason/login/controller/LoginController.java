package com.jason.login.controller;

import com.jason.login.httpResponse.HttpResponse;
import com.jason.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘小龙
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 手机号+验证码登录
     * @return
     */
    @GetMapping("/login/phone-code")
    public HttpResponse<?> loginByPhone(@RequestParam("phone") String phone,@RequestParam("code")String code){
        return HttpResponse.of(userService.accessByPhone(phone,code));
    }

    /**
     * 用户名+密码登录
     * @return
     */
    @GetMapping("/login/username-pwd")
    public HttpResponse<?> loginByUsername(@RequestParam("username") String username, @RequestParam("password")String password){
        return HttpResponse.of(userService.accessByUsername(username, password));
    }

    /**
     * 生成手机验证码
     * @return
     */
    @GetMapping("/verification")
    public HttpResponse<String> verificationCode(@RequestParam("phone") String phone){
        return HttpResponse.of(userService.getVerificationCode(phone));
    }
}
