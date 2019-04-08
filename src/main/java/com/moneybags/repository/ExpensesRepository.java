package com.moneybags.repository;

import com.moneybags.jpa.entity.Expenses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Users: daniel.baker
 * Date: 3/8/2015
 * Time: 10:16 PM
 */
@Repository
public interface ExpensesRepository extends CrudRepository<Expenses, Long> {
    List<Expenses> findByBudgets(Long budgIdSeq);
}
