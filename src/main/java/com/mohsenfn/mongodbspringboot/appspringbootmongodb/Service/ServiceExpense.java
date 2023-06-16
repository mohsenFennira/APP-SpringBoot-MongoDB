package com.mohsenfn.mongodbspringboot.appspringbootmongodb.Service;

import com.mohsenfn.mongodbspringboot.appspringbootmongodb.Model.Expense;
import com.mohsenfn.mongodbspringboot.appspringbootmongodb.Repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceExpense implements ExpenseIService{
    @Autowired
    ExpenseRepo er;
    @Override
    public void addExpense(Expense expense) {
          er.save(expense);
    }

    @Override
    public void updateExpense(Expense expense) {

    }

    @Override
    public List<Expense> getAllExpenses() {
        return null;
    }

    @Override
    public Expense getExpenseById(String id) {
        return null;
    }

    @Override
    public void DeleteExpense(String id) {

    }
}
