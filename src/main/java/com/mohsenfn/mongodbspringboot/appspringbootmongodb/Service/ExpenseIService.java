package com.mohsenfn.mongodbspringboot.appspringbootmongodb.Service;

import com.mohsenfn.mongodbspringboot.appspringbootmongodb.Model.Expense;

import java.util.List;

public interface ExpenseIService {
    public void addExpense(Expense expense);
    public void updateExpense(Expense expense);
    public List<Expense> getAllExpenses();
    public Expense getExpenseById(String id);
    public void DeleteExpense(String id);
}
