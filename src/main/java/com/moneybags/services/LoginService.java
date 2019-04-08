package com.moneybags.services;

import com.moneybags.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by dan on 2/18/15.
 */
@Service
public interface LoginService {
    void save(User user);
    User login(User user);
}
