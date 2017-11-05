package com.example.demo.repository;


import com.example.demo.model.Expense;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExpenseRepository {

    private List<Expense> expenses;

    public ExpenseRepository() {
        expenses = new ArrayList();
        expenses.add(new Expense("Masło", 5.99, "JEDZENIE"));
        expenses.add(new Expense("Chleb", 2.99, "JEDZENIE"));
        expenses.add(new Expense("Ciastka", 3.99, "JEDZENIE"));
        expenses.add(new Expense("Cebula", 3.99, "SŁODYCZE"));
        expenses.add(new Expense("Czekolada", 2.99, "SŁODYCZE"));
    }

    public List<Expense> getAll() {
        return expenses;
    }
}
