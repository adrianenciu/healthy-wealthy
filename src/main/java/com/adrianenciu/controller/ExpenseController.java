package com.adrianenciu.controller;

import com.adrianenciu.model.Expense;
import com.adrianenciu.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

import static java.time.LocalDate.now;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @RequestMapping(value = "/", method = GET)
    public ModelAndView getCurrentDateExpenses() {
        List<Expense> expenses = expenseService.getExpenses(now());
        return new ModelAndView("expenses", "expenses", expenses);
    }

    @RequestMapping(value = "/", method = POST)
    public String logNewExpense(@Valid Expense expense, BindingResult bindingResult, Model model) {
        System.out.println(expense.getType());
        List<Expense> expenses = expenseService.getExpenses(now());
        return "index";
//        return new ModelAndView("expenses", "expenses", expenses);
    }
}
