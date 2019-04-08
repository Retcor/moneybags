package com.moneybags.repository;

import com.moneybags.jpa.entity.Debts;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Users: daniel.baker
 * Date: 3/8/2015
 * Time: 10:16 PM
 */
public interface DebtsRepository extends CrudRepository<Debts, Long> {
    List<Debts> findByBudgets(Long budgIdSeq);
}
