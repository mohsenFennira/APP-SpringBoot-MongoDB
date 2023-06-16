package com.mohsenfn.mongodbspringboot.appspringbootmongodb.Controller;

import com.mohsenfn.mongodbspringboot.appspringbootmongodb.Model.Expense;
import com.mohsenfn.mongodbspringboot.appspringbootmongodb.Service.ExpenseIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
    @Autowired
    ExpenseIService eis;
    @PostMapping
    public void addExpense(@RequestBody Expense expense) {
       eis.addExpense(expense);
    }
}
