package com.moneybags.services;

import com.moneybags.domain.Debt;
import com.moneybags.domain.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Users: daniel.baker
 * Date: 3/8/2015
 * Time: 9:49 PM
 */
@Service
public interface DetailsService {
    void saveExpense(Expense expense);
    void saveDebt(Debt debt);
    List<Expense> getExpenses(Long budgIdSeq);
    List<Debt> getDebts(Long budgIdSeq);
}
