package com.stagejv8.Stagejv8.Controller;

import com.stagejv8.Stagejv8.Model.User;
import com.stagejv8.Stagejv8.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    private final UserService userserv;
    @Autowired
    public UserController (UserService userserv) {
        this.userserv = userserv;
    }

    @RequestMapping (method = RequestMethod.GET,value = "/users")
    public List < User > listAll() {
        return userserv.getUsers();
    }
    @RequestMapping ("/user/{id}")
    public User getUser(@PathVariable long id){return userserv.getUser (id);}

    @RequestMapping (method = RequestMethod.DELETE,value = "/user/{id}")
    public void deleteUser(@PathVariable long id){
        userserv.deleteUser (id);
    }
    @RequestMapping (method = RequestMethod.POST,value = "/users")
    public void addUser(@RequestBody User u){
        userserv.addUser (u);
    }

    @RequestMapping (method = RequestMethod.PUT,value = "/userupdate/{id}")
    public void updateUser(@RequestBody User u){
        userserv.addUser (u);
    }
}
