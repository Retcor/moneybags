package com.moneybags.services;

import com.moneybags.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dan on 2/18/15.
 */
@Service
public interface LoginService {
    public void save(User user);
    public List<User> login(User user);
}
