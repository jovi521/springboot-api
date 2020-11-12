package com.example.springdoc.controller;

import com.example.springdoc.model.Pet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jovi
 */
@Tag(name = "PetController", description = "PET 的控制类")
@RestController
public class PetController {

    @Operation(summary = "list", description = "遍历宠物", method = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping("list")
    public Pet list() {
        Pet pet = new Pet();
        pet.setPetName("Miss");
        return pet;
    }
}
