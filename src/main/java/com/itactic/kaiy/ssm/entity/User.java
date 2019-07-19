package com.itactic.kaiy.ssm.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

/**
 * @ClassName User
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&10:35
 * @Version 1.0
 **/

@Data
@ApiModel("用户实体清单")
public class User implements Serializable {

    private Long uid;

    private String username;

    private String name;

    private  String sex;

    private String email;

    private String avatar;

    private String password;

    private int status;

    private Date created;

    private String salt;

    private Set<Role> roles;


}
