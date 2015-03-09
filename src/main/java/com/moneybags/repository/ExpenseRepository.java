package com.moneybags.repository;

import com.moneybags.models.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: daniel.baker
 * Date: 3/8/2015
 * Time: 10:16 PM
 */
@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
    List<Expense> findByUserId(Long userId);
}
