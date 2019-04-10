package com.moneybags.controllers;

import com.moneybags.domain.Budget;
import com.moneybags.domain.Debt;
import com.moneybags.domain.Expense;
import com.moneybags.services.BudgetsService;
import com.moneybags.services.DetailsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Users: daniel.baker
 * Date: 3/8/2015
 * Time: 9:48 PM
 */
@RestController
public class BudgetsController {
    @Resource
    BudgetsService budgetsService;

    @RequestMapping(value = "/saveBudget", method = RequestMethod.POST)
    @ResponseBody
    public Budget saveBudget(@RequestBody final Budget budget) {
        return budgetsService.saveBudget(budget);
    }

    @RequestMapping(value = "/getBudgets", method = RequestMethod.POST)
    @ResponseBody
    public List<Budget> getBudgets(@RequestBody final Long userIdSeq) {
        return budgetsService.getBudgets(userIdSeq);
    }
}
