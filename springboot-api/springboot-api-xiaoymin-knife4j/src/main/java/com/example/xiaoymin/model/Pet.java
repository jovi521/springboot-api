package com.example.xiaoymin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jovi
 */
@ApiModel(value = "Pet", description = "Pet 实体类")
@Data
public class Pet {

    @ApiModelProperty(name = "id", value = "主键", position = 1)
    private Integer id;

    @ApiModelProperty(name = "petName", value = "宠物名", required = true, position = 2)
    private String petName;
}
