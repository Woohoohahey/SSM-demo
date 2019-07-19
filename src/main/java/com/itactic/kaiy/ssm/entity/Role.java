package com.itactic.kaiy.ssm.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * @ClassName Role
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&13:38
 * @Version 1.0
 **/
@Data
public class Role implements Serializable {

    private Long rid;

    private String name;

    private String description;

    private String signature;

    private Date created;
}
