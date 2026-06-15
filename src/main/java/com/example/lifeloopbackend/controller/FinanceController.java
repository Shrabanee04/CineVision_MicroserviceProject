package com.example.lifeloopbackend.controller;

import com.example.lifeloopbackend.dto.*;
import com.example.lifeloopbackend.entity.Expense;
import com.example.lifeloopbackend.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/finance")

public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @PostMapping
    public ExpenseResponse addExpense(
            @RequestBody ExpenseRequest request){

        return financeService.addExpense(request);
    }

    @GetMapping
    public List<Expense> getAllExpenses(){

        return financeService.getAllExpenses();
    }
}
