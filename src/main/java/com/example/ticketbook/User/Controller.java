package com.example.ticketbook.User;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/user")
public class Controller {


    @GetMapping("/test")
    public String monkey(){
        return "hello ni";
    }
}
