package com.example.lifeloopbackend.repository;

import com.example.lifeloopbackend.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository
        extends JpaRepository<Expense,Long>{

}
