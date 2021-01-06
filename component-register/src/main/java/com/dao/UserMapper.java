package com.dao;

import com.pojo.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {
    public void addUser(User user){
        System.out.println("insert a user");
    }
}
