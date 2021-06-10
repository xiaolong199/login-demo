package com.jason.login.service;

import com.jason.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author 刘小龙
 */
@Service
public class UserService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserRepository userRepository;

    public String accessByPhone(String phone, String code) {
        //校验验证码

        //判断该手机号是否已经注册

        //生成token返回给前端

        return "";
    }

    public String accessByUsername(String username, String password) {
        //从数据库通过用户名查找，判断用户是否从存在

        //校验密码，数据库存放的是加密后的密文，并且是不可逆的，需要用前端传来的进行加密，并与数据库的秘文对比是否一致

        //生成token返回给前端
        return "";
    }

    /**
     * 模拟调用第三方短信平台生成验证码
     *
     * @param phone
     * @return
     */
    public String getVerificationCode(String phone) {
        //生成随机六位数验证码
        String code = randomStr();
        //用手机号作为缓存的key，随机生成的验证码作为value,并设置过期时间放入redis
        redisTemplate.opsForValue().set(phone, code, 30L, TimeUnit.SECONDS);
        //返回给前端验证码
        return code;
    }

    private String randomStr() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //随机对象
        Random rand = new Random();
        //循环产生
        for (int i = 10; i > 1; i--) {
            int index = rand.nextInt(i);
            int tmp = array[index];
            array[index] = array[i - 1];
            array[i - 1] = tmp;
        }
        //拼接结果为字符串
        int result = 0;
        for (int i = 0; i < 6; i++) {
            result = result * 10 + array[i];
        }
        String sixString = Integer.toString(result);
        //有可能出现5位数，前面加0补全
        if (sixString.length() == 5) {
            sixString = "0" + sixString;

        }
        return sixString;
    }
}
