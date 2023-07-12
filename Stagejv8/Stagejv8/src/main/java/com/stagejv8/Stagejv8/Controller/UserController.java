package com.stagejv8.Stagejv8.Controller;

import com.stagejv8.Stagejv8.Model.User;
import com.stagejv8.Stagejv8.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getusers")
    public List<User> listAll() {
        try {
            return userService.getUsers();
        } catch (Exception e) {
            // Handle the exception or log the error
            // You can return an appropriate response or throw a custom exception if needed
            e.printStackTrace();
            return Collections.emptyList(); // Return an empty list or any other default value
        }
    }

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable long id) {
        try {
            return userService.getUser(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Return null or any other default value
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteuser/{id}")
    public void deleteUser(@PathVariable long id) {
        try {
            userService.deleteUser(id);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception or log the error
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/adduser")
    public void addUser(@RequestBody User u) {
        try {
            userService.addUser(u);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception or log the error
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/userupdate/{id}")
    public void updateUser(@RequestBody User u) {
        try {
            userService.updateUser(u);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception or log the error
        }
    }
}
