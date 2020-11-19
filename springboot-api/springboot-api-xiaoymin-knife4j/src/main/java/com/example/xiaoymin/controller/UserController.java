package com.example.xiaoymin.controller;

import com.example.common.model.UserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jovi
 */
@Api(tags = "UserController")
@RestController
public class UserController {

    @ApiOperation(notes = "遍历用户", value = "listUser遍历用户")
    @GetMapping("list")
    public UserModel listUser() {
        UserModel userModel = new UserModel();
        userModel.setUserName("jovi");
        userModel.setAge(18);
        return userModel;
    }
}
