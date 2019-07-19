package com.itactic.kaiy.ssm.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Book
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/17&15:15
 * @Version 1.0
 **/
@Data
@ApiModel("书籍实体")
public class Book implements Serializable {

    @ApiModelProperty("书籍id")
    private Long bid;

    private String name;

    private String type;

    private String author;
}
