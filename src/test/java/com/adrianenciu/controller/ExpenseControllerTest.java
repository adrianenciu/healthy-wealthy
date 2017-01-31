package com.adrianenciu.controller;

import com.adrianenciu.model.Expense;
import com.adrianenciu.service.ExpenseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

import static com.adrianenciu.model.ExpenseBuilderForTest.anExpense;
import static com.google.common.collect.Lists.newArrayList;
import static java.time.LocalDate.now;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ExpenseControllerTest {

    @Mock
    private ExpenseService expenseService;

    @InjectMocks
    private ExpenseController expenseController;

    @Test
    public void whenGettingTheCurrentDateExpenses_returnAllExpensesFromThatDay() throws Exception {
        Expense expense = anExpense().withDefaults().build();
        when(expenseService.getExpenses(now())).thenReturn(newArrayList(expense));

        ModelAndView actual = expenseController.getCurrentDateExpenses();

        assertThat(actual.getViewName()).isEqualTo("expenses");
        assertThat(actual.getModelMap().get("expenses")).isEqualTo(newArrayList(expense));
    }
}