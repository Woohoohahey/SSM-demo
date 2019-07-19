package com.itactic.kaiy.ssm.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * @ClassName permission
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&13:39
 * @Version 1.0
 **/
public class permission implements Serializable {

    private Long pid;

    private String name;

    private String description;

    private String signature;

    private Date created;
}
