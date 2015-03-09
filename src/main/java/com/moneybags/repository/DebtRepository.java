package com.moneybags.repository;

import com.moneybags.models.Debt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * User: daniel.baker
 * Date: 3/8/2015
 * Time: 10:16 PM
 */
public interface DebtRepository extends CrudRepository<Debt, Long> {
    List<Debt> findByUserId(Long userId);
}
