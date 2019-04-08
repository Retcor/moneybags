package com.moneybags.services;

import com.moneybags.domain.User;
import com.moneybags.jpa.entity.Users;
import com.moneybags.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dan on 2/18/15.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public void save(User user) {
        Users users = null;

        if (user.getUserIdSeq() != null) {
            users = usersRepository.findOne(user.getUserIdSeq());
        } else {
            // TODO: Need to check and make sure no other user with this username exists
            users = new Users();
        }

        users.setUserName(user.getUserName());
        users.setPassword(user.getPassword());

        usersRepository.save(users);
    }

    @Override
    @Transactional(readOnly = true)
    public User login(User user) {
        Users users = usersRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
        user.setUserIdSeq(users != null ? users.getUserIdSeq() : null);
        return user;
    }
}
