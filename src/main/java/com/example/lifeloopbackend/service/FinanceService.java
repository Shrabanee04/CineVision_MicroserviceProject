package com.example.lifeloopbackend.service;

import com.example.lifeloopbackend.dto.*;
import com.example.lifeloopbackend.entity.Expense;
import com.example.lifeloopbackend.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public ExpenseResponse addExpense(
            ExpenseRequest request){

        Expense expense = new Expense();

        expense.setTitle(request.getTitle());
        expense.setAmount(request.getAmount());
        expense.setType(request.getType());
        expense.setCategory(request.getCategory());
        expense.setDate(request.getDate());

        expenseRepository.save(expense);

        return new ExpenseResponse(
                "Expense Added Successfully!"
        );
    }

    public List<Expense> getAllExpenses(){

        return expenseRepository.findAll();
    }
}
