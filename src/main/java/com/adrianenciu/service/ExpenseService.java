package com.adrianenciu.service;

import com.adrianenciu.model.Expense;
import com.adrianenciu.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getExpenses(LocalDate date) {
        return expenseRepository.findByDate(date);
    }

}
