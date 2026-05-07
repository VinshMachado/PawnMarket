package com.example.ticketbook.User;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/user")
public class UserController {


    @GetMapping("/test")
    public String monkey(){
        return "hello ni";
    }

    @PostMapping("/user")
    public void user(@RequestBody int name){

    }


}
