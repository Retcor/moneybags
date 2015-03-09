package com.moneybags.controllers;

import com.moneybags.models.User;
import com.moneybags.services.LoginService;

import org.springframework.http.MediaType;
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
