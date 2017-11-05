package com.example.demo.controller;

import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired ExpenseRepository expenseRepository;

    @GetMapping("")
    @ResponseBody
    public String getList(@RequestParam(required = false) String kategoria,
                          @RequestParam(required = false) String sortowanie) {
        String result = "";

        List<Expense> expenses = expenseRepository.getAll();

        if(sortowanie != null) {
            if(sortowanie.equals("nazwa")) {
                expenses.sort(new Comparator<Expense>() {
                    @Override
                    public int compare(Expense o1, Expense o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
            }
        }


        double cena = 0;

        for (Expense expense : expenses) {
            if(kategoria == null || expense.getCategory().equals(kategoria)) {
                result += expense.toString() + "<br/>";
                cena += expense.getPrice();
            }
        }

        result += "Cena całkowita: " + cena;

        return result;
    }

}
