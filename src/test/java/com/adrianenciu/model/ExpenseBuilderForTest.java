package com.adrianenciu.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.time.LocalDate.now;

public class ExpenseBuilderForTest {

    private String type;
    private BigDecimal amount;
    private LocalDate date;

    private ExpenseBuilderForTest() {
    }

    public static ExpenseBuilderForTest anExpense() {
        return new ExpenseBuilderForTest();
    }

    public ExpenseBuilderForTest withDefaults() {
        this.type = "Transport";
        this.amount = BigDecimal.valueOf(20.5);
        this.date = now().minusDays(1);
        return this;
    }

    public Expense build() {
        Expense expense = new Expense();
        expense.setType(type);
        expense.setAmount(amount);
        expense.setDate(date);
        return expense;
    }

    public ExpenseBuilderForTest withType(String type) {
        this.type = type;
        return this;
    }

    public ExpenseBuilderForTest withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public ExpenseBuilderForTest withDate(LocalDate date) {
        this.date = date;
        return this;
    }
}
