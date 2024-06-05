package com.Spring.SpringBootMysql.controller;

import com.Spring.SpringBootMysql.Service.UserService;
import com.Spring.SpringBootMysql.model.User;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@Controller
public class UserController {

    @Autowired
    UserService userService;

    // GET ALL USERS
    @GetMapping("/userlist")
    public Iterable<User> getAllUser() {
        return userService.getAllUser();
    }

    // POST NEW USER
    @PostMapping("/inputuser")
    public User createdUser(@RequestBody User user) {

        if (user == null)
            throw new NullPointerException();
        return userService.createdUser(user);
    }

    // DELETE
    @DeleteMapping("/deleteuser")
    public void deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
    }

    //LOGIN
    @PostMapping("/login")
    public User login(@RequestBody Map<String, String> dataMap) {
        return userService.login(dataMap);
    }
}
