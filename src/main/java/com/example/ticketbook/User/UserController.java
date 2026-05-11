package com.example.ticketbook.User;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/user")
public class UserController {
    private final  UserRepo user;

    UserController(UserRepo user){
        this.user=  user;
    }

    @GetMapping("/test")
    public String monkey(){
        return "hello ni";
    }

    @PostMapping("/user")
    public void user(@RequestBody int name){

    }


}
