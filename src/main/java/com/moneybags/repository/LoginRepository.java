package com.moneybags.repository;

import com.moneybags.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dan on 2/18/15.
 */
@Repository
public interface LoginRepository extends CrudRepository<User, Long> {
    User findByUserNameAndPassword(String userName, String password);
}
