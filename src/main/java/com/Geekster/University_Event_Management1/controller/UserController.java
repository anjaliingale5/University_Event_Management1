package com.Geekster.University_Event_Management1.controller;


import com.Geekster.University_Event_Management1.model.UserManage;
import com.Geekster.University_Event_Management1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("User")
    public String addUser(@RequestBody UserManage newUser){
        return userService.addUser(newUser);
    }

    @PostMapping("Users")
    public String addUsers(@RequestBody List<UserManage> newUsers) {
        return userService.addUsers(newUsers);
    }

    @GetMapping("userMan/allUsers")
    public List<UserManage> getRooms()
    {
        return userService.getUsers();
    }

    @GetMapping("Users/id/{id}")
    public UserManage getRoomById(@PathVariable Integer id)
    {
        return userService.getUserById(id);
    }

    @PutMapping("updateUserInfo/{id}")
    public String updateUser(@PathVariable Integer id, @RequestBody UserManage user){
        userService.updateUser(id,user);
        return "Update User" ;
    }

    @DeleteMapping("Users/delete/{ids}")
    public String removeUsersByIds(@PathVariable Integer ids){

        return userService.removeUsers(ids);
    }
}


