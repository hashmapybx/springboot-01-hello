package com.tx.springboot.controller;

import com.tx.springboot.entity.User;
import com.tx.springboot.service.PatientInformationService;
import com.tx.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/testBoot")
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)  //解决前后台的分离跨域问题
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id) {
        return  userService.sel(id).toString();
    }

    @RequestMapping("/insert")
    public String insertUser(@RequestBody User user) {
        return  userService.insertUser(user) > 0 ? "success" : "failure";
    }






}
