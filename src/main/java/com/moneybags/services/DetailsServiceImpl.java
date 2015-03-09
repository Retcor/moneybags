package com.moneybags.services;

import com.moneybags.models.Debt;
import com.moneybags.models.Expense;
import com.moneybags.repository.DebtRepository;
import com.moneybags.repository.ExpenseRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: daniel.baker
 * Date: 3/8/2015
 * Time: 10:15 PM
 */
@Component("detailsService")
public class DetailsServiceImpl implements DetailsService {
    @Resource
    ExpenseRepository expenseRepository;
    @Resource
    DebtRepository debtRepository;

    @Override
    public void saveExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    @Override
    public void saveDebt(Debt debt) {
        debtRepository.save(debt);
    }

    @Override
    public List<Expense> getExpenses(Long userId) {
        return expenseRepository.findByUserId(userId);
    }

    @Override
    public List<Debt> getDebts(Long userId) {
        return debtRepository.findByUserId(userId);
    }
}
