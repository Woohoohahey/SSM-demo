package com.itactic.kaiy.ssm.dao;

import com.itactic.kaiy.ssm.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName RoleMapper
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&13:41
 * @Version 1.0
 **/

public interface RoleMapper {

    public List<Role> findRolesByUsername(String username);

}
