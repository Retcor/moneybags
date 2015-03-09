package com.moneybags.services;

import com.moneybags.models.Debt;
import com.moneybags.models.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: daniel.baker
 * Date: 3/8/2015
 * Time: 9:49 PM
 */
@Service
public interface DetailsService {
    public void saveExpense(Expense expense);
    public void saveDebt(Debt debt);
    public List<Expense> getExpenses(Long userId);
    public List<Debt> getDebts(Long userId);
}
