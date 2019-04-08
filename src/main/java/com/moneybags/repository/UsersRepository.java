package com.moneybags.repository;

import com.moneybags.jpa.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dan on 2/18/15.
 */
@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    Users findByUserNameAndPassword(String userName, String password);
}
