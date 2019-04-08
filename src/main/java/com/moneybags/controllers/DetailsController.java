package com.moneybags.controllers;

import com.moneybags.domain.Debt;
import com.moneybags.domain.Expense;
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
public class DetailsController {
    @Resource
    DetailsService detailsService;

    @RequestMapping(value = "/saveDebt", method = RequestMethod.POST)
    @ResponseBody
    public void saveDebt(@RequestBody final Debt debt) {
        detailsService.saveDebt(debt);
    }

    @RequestMapping(value = "/saveExpense", method = RequestMethod.POST)
    @ResponseBody
    public void saveExpense(@RequestBody final Expense expense) {
        detailsService.saveExpense(expense);
    }

    @RequestMapping(value = "/getDebts", method = RequestMethod.POST)
    @ResponseBody
    public List<Debt> getDebts(@RequestBody final Long budgIdSeq) {
        return detailsService.getDebts(budgIdSeq);
    }

    @RequestMapping(value = "/getExpenses", method = RequestMethod.POST)
    @ResponseBody
    public List<Expense> getExpenses(@RequestBody final Long budgIdSeq) {
        return detailsService.getExpenses(budgIdSeq);
    }
}
