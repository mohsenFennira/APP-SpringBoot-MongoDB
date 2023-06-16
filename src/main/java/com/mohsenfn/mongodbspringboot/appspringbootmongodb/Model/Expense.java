package com.mohsenfn.mongodbspringboot.appspringbootmongodb.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document("expense")
public class Expense {
    @Id
    private String id;
    private String expenseName;
    private ExpenseCategory expenseCategory;

}
