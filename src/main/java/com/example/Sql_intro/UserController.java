package com.example.Sql_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String createUser(@RequestBody() User user){
        return userService.creteUser(user);
    }

    @GetMapping("/getUser")
    public User getuser(@RequestParam("id")Integer id){
        return userService.getUser(id);
    }
}
