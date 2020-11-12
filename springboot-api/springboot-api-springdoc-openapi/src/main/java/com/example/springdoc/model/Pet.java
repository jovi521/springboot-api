package com.example.springdoc.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author jovi
 */
@Schema(name = "Pet", description = "Pet 实体类")
@Data
public class Pet {

    @Schema(name = "id", description = "主键")
    private Integer id;

    @Schema(name = "petName", description = "宠物名", required = true)
    private String petName;
}
