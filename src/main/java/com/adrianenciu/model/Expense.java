package com.adrianenciu.model;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.springframework.format.annotation.NumberFormat.Style.CURRENCY;

public class Expense {

    @Id
    private String id;

    private String type;

    @NumberFormat(style = CURRENCY)
    private BigDecimal amount;

    private LocalDate date;

    public Expense() {
    }

    public Expense(String type, BigDecimal amount, LocalDate date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
