package com.moneybags.controllers;

import com.moneybags.domain.User;
import com.moneybags.jpa.entity.Users;
import com.moneybags.services.LoginService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by dan on 2/18/15.
 */
@RestController
public class LoginController {
    @Resource
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public User login(@RequestBody final User user) {
        return loginService.login(user);
    }

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public void createUser(@RequestBody final User user) {
        loginService.save(user);
    }
}
