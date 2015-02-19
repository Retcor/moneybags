package com.moneybags.controllers;

import com.moneybags.models.User;
import com.moneybags.services.LoginService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by dan on 2/18/15.
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Resource
    LoginService loginService;

    @RequestMapping("/save")
    public void login(@RequestBody User user) {
        System.out.println("It's working!");

        loginService.save(user);
    }
}
