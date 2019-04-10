package com.moneybags.repository;

import com.moneybags.jpa.entity.Budgets;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Users: daniel.baker
 * Date: 3/8/2015
 * Time: 10:16 PM
 */
public interface BudgetsRepository extends CrudRepository<Budgets, Long> {
    @Query("from Budgets b WHERE b.users.userIdSeq=:userIdSeq")
    List<Budgets> findByUser(@Param("userIdSeq") Long userIdSeq);
}
