package com.moneybags.services;

import com.moneybags.domain.Budget;
import com.moneybags.domain.Debt;
import com.moneybags.domain.Expense;
import com.moneybags.jpa.entity.Budgets;
import com.moneybags.jpa.entity.Debts;
import com.moneybags.jpa.entity.Expenses;
import com.moneybags.repository.BudgetsRepository;
import com.moneybags.repository.DebtsRepository;
import com.moneybags.repository.ExpensesRepository;
import com.moneybags.repository.UsersRepository;
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
public class BudgetsServiceImpl implements BudgetsService {
    @Autowired
    BudgetsRepository budgetsRepository;
    @Autowired
    UsersRepository usersRepository;


    @Override
    public Budget saveBudget(Budget budget) {
        Budgets instance = null;

        if (budget.getBudgIdSeq() != null) {
            instance = budgetsRepository.findOne(budget.getBudgIdSeq());
        } else {
            instance = new Budgets();
        }

        instance.setDescr(budget.getDescr());
        instance.setUsers(usersRepository.findOne(budget.getUserIdSeq()));

        instance = budgetsRepository.save(instance);

        budget.setBudgIdSeq(instance.getBudgIdSeq());

        return budget;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Budget> getBudgets(Long userIdSeq) {
        List<Budget> returnList = new ArrayList<Budget>();
        List<Budgets> budgets = budgetsRepository.findByUser(userIdSeq);

        if (!CollectionUtils.isEmpty(budgets)) {
            for (Budgets budget : budgets) {
                Budget domain = new Budget();
                domain.setBudgIdSeq(budget.getBudgIdSeq());
                domain.setDescr(budget.getDescr());
                domain.setUserIdSeq(budget.getUsers() != null ? budget.getUsers().getUserIdSeq() : null);

                returnList.add(domain);
            }
        }

        return returnList;
    }
}
