package com.adrianenciu.repository;

import com.adrianenciu.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
    List<Expense> findByDate(LocalDate date);
}
