package com.itactic.kaiy.ssm.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName ExceptionHandler
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&20:51
 * @Version 1.0
 **/
@RestControllerAdvice
public class MyExceptionHandler {


    @ExceptionHandler(AuthorizationException.class)
    public String exception1(AuthorizationException e){
        return e.toString();
    }


}
