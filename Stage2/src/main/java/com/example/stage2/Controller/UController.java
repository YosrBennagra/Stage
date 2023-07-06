package com.example.stage2.Controller;

import com.example.stage2.Model.U;
import com.example.stage2.Service.UService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class UController {


    private final UService userserv;
    @Autowired
    public UController(UService userserv) {
        this.userserv = userserv;
    }

    @RequestMapping (method = RequestMethod.GET,value = "/users")
    public List < U > listAll() {
        return userserv.getUsers();
    }

    @RequestMapping("/user/{id}")
    public U getUser(@PathVariable long id){return userserv.getUser (id);}

    @RequestMapping (method = RequestMethod.DELETE,value = "/user/{id}")
    public void deleteUser(@PathVariable long id){
        userserv.deleteUser (id);
    }
    @RequestMapping (method = RequestMethod.POST,value = "/users")
    public void addUser(@RequestBody U u){
        userserv.addUser (u);
    }

    @RequestMapping (method = RequestMethod.PUT,value = "/userupdate/{id}")
    public void updateUser(@RequestBody U u){
        userserv.addUser (u);
    }
}
