package com.mohsenfn.mongodbspringboot.appspringbootmongodb.Repository;

import com.mohsenfn.mongodbspringboot.appspringbootmongodb.Model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends MongoRepository<Expense,String> {
}
