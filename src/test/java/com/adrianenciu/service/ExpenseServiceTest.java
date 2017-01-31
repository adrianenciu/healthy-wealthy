package com.adrianenciu.service;

import com.adrianenciu.model.Expense;
import com.adrianenciu.repository.ExpenseRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.List;

import static com.adrianenciu.model.ExpenseBuilderForTest.anExpense;
import static com.google.common.collect.Lists.newArrayList;
import static java.time.LocalDate.now;

@RunWith(MockitoJUnitRunner.class)
public class ExpenseServiceTest {

    @Mock
    private ExpenseRepository expenseRepository;

    @InjectMocks
    private ExpenseService expenseService;

    private LocalDate currentDate = now();

    @Test
    public void givenADate_whenGettingTheExpenses_thenReturnTheCorrectOnes() throws Exception {
        Expense expense = anExpense().withDefaults().build();
        Mockito.when(expenseRepository.findByDate(currentDate)).thenReturn(newArrayList(expense));

        List<Expense> actual = expenseService.getExpenses(currentDate);

        Assertions.assertThat(actual).containsExactly(expense);
    }
}