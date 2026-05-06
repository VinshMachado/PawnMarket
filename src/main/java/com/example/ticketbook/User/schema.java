package com.example.ticketbook.User;

import org.jspecify.annotations.NonNull;


import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
public class schema {

    @NotBlank
     String name;
    @Min(value=1,message = "Ivalid age")@Max(value=100 ,message = "Age cannot be greater than 100")
    private int age;





}


