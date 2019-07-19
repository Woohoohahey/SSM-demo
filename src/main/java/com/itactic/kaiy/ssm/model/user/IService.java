package com.itactic.kaiy.ssm.model.user;

import com.itactic.kaiy.ssm.dao.UserMapper;
import com.itactic.kaiy.ssm.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName IService
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&13:37
 * @Version 1.0
 **/
@Service("userService")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class IService {

    private final UserMapper userMapper;


    public User findUserByUsername(String username){
        return userMapper.findUserByUsername(username);
    }
}
