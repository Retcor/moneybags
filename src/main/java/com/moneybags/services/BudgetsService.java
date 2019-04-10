package com.moneybags.services;

import com.moneybags.domain.Budget;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Users: daniel.baker
 * Date: 3/8/2015
 * Time: 9:49 PM
 */
@Service
public interface BudgetsService {
    Budget saveBudget(Budget budget);
    List<Budget> getBudgets(Long userIdSeq);
}
