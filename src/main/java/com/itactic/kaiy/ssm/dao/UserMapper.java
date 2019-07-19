package com.itactic.kaiy.ssm.dao;

import com.itactic.kaiy.ssm.entity.User;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&13:37
 * @Version 1.0
 **/
public interface UserMapper {
    User findUserByUsername(String username);
}
