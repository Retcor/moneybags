package com.moneybags.services;

import com.moneybags.domain.Debt;
import com.moneybags.domain.Expense;
import com.moneybags.jpa.entity.Debts;
import com.moneybags.jpa.entity.Expenses;
import com.moneybags.repository.BudgetsRepository;
import com.moneybags.repository.DebtsRepository;
import com.moneybags.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Users: daniel.baker
 * Date: 3/8/2015
 * Time: 10:15 PM
 */
@Service
public class DetailsServiceImpl implements DetailsService {
    @Autowired
    BudgetsRepository budgetsRepository;
    @Autowired
    ExpensesRepository expensesRepository;
    @Autowired
    DebtsRepository debtsRepository;

    @Override
    public void saveExpense(Expense expense) {
        Expenses instance = null;

        if (expense.getExpsIdSeq() != null) {
            instance = expensesRepository.findOne(expense.getExpsIdSeq());
        } else {
            instance = new Expenses();
        }

        instance.setBudgets(budgetsRepository.findOne(expense.getBudgIdSeq()));
        instance.setDescr(expense.getDescr());
        instance.setDueDate(expense.getDueDate());
        instance.setAmount(expense.getAmount());

        expensesRepository.save(instance);
    }

    @Override
    public void saveDebt(Debt debt) {
        Debts instance = null;

        if (debt.getDebtIdSeq() != null) {
            instance = debtsRepository.findOne(debt.getDebtIdSeq());
        } else {
            instance = new Debts();
        }

        instance.setBudgets(budgetsRepository.findOne(debt.getBudgIdSeq()));
        instance.setDescr(debt.getDescr());
        instance.setDueDate(debt.getDueDate());
        instance.setPayAmount(debt.getPayAmount());
        instance.setRate(debt.getRate());
        instance.setTotalLeft(debt.getTotalLeft());

        debtsRepository.save(instance);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Expense> getExpenses(Long budgIdSeq) {
        List<Expense> returnList = new ArrayList<Expense>();
        List<Expenses> expenses = expensesRepository.findByBudgets(budgIdSeq);

        if (!CollectionUtils.isEmpty(expenses)) {
            for (Expenses expense : expenses) {
                Expense domain = new Expense();
                domain.setExpsIdSeq(expense.getExpsIdSeq());
                domain.setAmount(expense.getAmount());
                domain.setBudgIdSeq(expense.getBudgets() != null ? expense.getBudgets().getBudgIdSeq() : null);
                domain.setDescr(expense.getDescr());
                domain.setDueDate(expense.getDueDate());

                returnList.add(domain);
            }
        }

        return returnList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Debt> getDebts(Long budgIdSeq) {
        List<Debt> returnList = new ArrayList<Debt>();
        List<Debts> debts = debtsRepository.findByBudgets(budgIdSeq);

        if (!CollectionUtils.isEmpty(debts)) {
            for (Debts debt : debts) {
                Debt domain = new Debt();
                domain.setDebtIdSeq(debt.getDebtIdSeq());
                domain.setPayAmount(debt.getPayAmount());
                domain.setBudgIdSeq(debt.getBudgets() != null ? debt.getBudgets().getBudgIdSeq() : null);
                domain.setDescr(debt.getDescr());
                domain.setDueDate(debt.getDueDate());
                domain.setRate(debt.getRate());
                domain.setTotalLeft(debt.getTotalLeft());

                returnList.add(domain);
            }
        }

        return returnList;
    }
}
