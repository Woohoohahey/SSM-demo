package com.itactic.kaiy.ssm.model.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName V2Controller
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&14:43
 * @Version 1.0
 **/
@Api(tags = "用户相关接口")
@RestController("userController")
@RequestMapping("/v2/user")
public class V2Controller {


    @PostMapping("/doLogin")
    @ApiOperation("用户登陆")
    public String Login(@RequestParam String usernaem
                        ,@RequestParam String password){

        try {
            Subject subject = SecurityUtils.getSubject();
            subject.login(new UsernamePasswordToken(usernaem, password));
        }catch (AuthenticationException e){
            return e.toString();
        }
        return  "final";
    }
}
