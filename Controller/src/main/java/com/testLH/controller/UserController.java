package com.testLH.controller;

import ch.qos.logback.core.joran.spi.ElementSelector;
import com.testLH.entity.JobsClass;
import com.testLH.entity.UserClass;
import com.testLH.services.UserServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserClass.class);

    @Autowired
    private UserServices userServices;

    @GetMapping("/{id}")
    public UserClass findById(@PathVariable int id) {
        if(id < 0)
            logger.error("NO NEGATIVE NUMBER AS ID!");
        else
            logger.info("THE USER IS FOUND!");
        return userServices.getUserById(id);
    }

    @PutMapping("/update")
    public UserClass updateUser(@RequestBody UserClass userClass) {
        if(userClass == null)
            logger.error("USER CLASS: NULL");
        else
            logger.info("UPDATE USER: SUCCESSFULLY");
        return userServices.updateUser(userClass);
    }

    @GetMapping("/findUser/{username}/{password}")
    public List<UserClass> findByPassword(@PathVariable String username, @PathVariable String password) {
        if(username == null && !username.trim().isEmpty() && password == null && !password.trim().isEmpty())
            logger.error("WRONG USERNAME OR PASSWORD!");
        else
            logger.info("THE USER IS FOUND!");
        return userServices.findUser(username, password);
    }
}
