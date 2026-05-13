package com.example.ticketbook.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    public Map<String,String> user(@RequestBody User usr){

        this.user.save(usr);
        return Map.of("Message","added User Successfully ");
    }


}
