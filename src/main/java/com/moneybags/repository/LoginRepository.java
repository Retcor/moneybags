package com.moneybags.repository;

import com.moneybags.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dan on 2/18/15.
 */
@Repository
public interface LoginRepository extends JpaRepository<User, Long> {
}
