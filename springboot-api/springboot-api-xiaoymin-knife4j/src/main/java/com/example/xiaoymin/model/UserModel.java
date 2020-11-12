package com.example.xiaoymin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jovi
 */
@ApiModel(value = "UserModel", description = "user 实体类")
@Data
public class UserModel {

    @ApiModelProperty(name = "id", value = "主键", position = 1)
    private Integer id;

    @ApiModelProperty(name = "userName", value = "用户名", required = true, position = 2)
    private String userName;

    @ApiModelProperty(name = "age", value = "年龄", required = true, position = 3)
    private int age;

    @ApiModelProperty(name = "pet", value = "宠物", position = 4)
    private Pet pet;
}
