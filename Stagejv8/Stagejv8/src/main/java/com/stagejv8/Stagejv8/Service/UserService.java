package com.stagejv8.Stagejv8.Service;


import com.stagejv8.Stagejv8.Model.User;

import com.stagejv8.Stagejv8.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private UserRepository userrep;
    @Autowired
    public UserService (UserRepository userrep) {
        this.userrep = userrep;
    }

    public List < User > getUsers() {
        return (List < User >) userrep.findAll ();
    }

    public User getUser(long id){
        return userrep.findById (id).orElse (null);
    }

    public void deleteUser(long id){
        userrep.deleteById (id);
    }

    public void addUser(User u){
        userrep.save (u);
    }

    public void updateUser(User u){
        userrep.save (u);
    }

}
