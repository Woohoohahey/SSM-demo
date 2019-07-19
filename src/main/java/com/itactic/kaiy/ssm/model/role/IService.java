package com.itactic.kaiy.ssm.model.role;

import com.itactic.kaiy.ssm.dao.RoleMapper;
import com.itactic.kaiy.ssm.entity.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName IService
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&20:44
 * @Version 1.0
 **/
@Service("roleService")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class IService {

    private final RoleMapper roleMapper;

    public List<Role> findRolesByUsername(String username){
        return roleMapper.findRolesByUsername(username);
    }
}
