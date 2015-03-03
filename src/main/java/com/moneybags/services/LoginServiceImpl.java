package com.moneybags.services;

import com.moneybags.models.User;
import com.moneybags.repository.LoginRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by dan on 2/18/15.
 */
@Component("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginRepository loginRepository;

    @Override
    public void save(User user) {
        loginRepository.save(user);
    }

    @Override
    public List<User> login(User user) {
        return loginRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
    }
}
