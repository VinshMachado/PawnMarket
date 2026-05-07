package com.example.ticketbook.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Users")
public class User {
    @NotBlank
    String name;
    @Min(value=1,message = "Ivalid age")@Max(value=100 ,message = "Age cannot be greater than 100")
    private int age;

    @NotBlank(message = "Gmail Required")
    @Email(message = "give a valid Email")
    private String gmail;

    private  String passWord;
}
