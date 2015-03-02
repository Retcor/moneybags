package com.moneybags.controllers;

import com.moneybags.models.User;
import com.moneybags.services.LoginService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.awt.*;

/**
 * Created by dan on 2/18/15.
 */
@RestController
public class LoginController {
    @Resource
    LoginService loginService;

    @RequestMapping("/login")
    public void login() {
        System.out.println("It's working!");
    }

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public void createUser(@RequestBody final User user) {
        loginService.save(user);
    }
}
