package com.example.Sql_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {

    @Autowired
    UserRepository userRepository;

    public String creteUser(User user){

        userRepository.save(user);
        return "User added Successfully";
    }
    public User getUser(int id){
        User user= userRepository.findById(id).get(); //Help to find the entity by primary key
        return user;
    }
}
