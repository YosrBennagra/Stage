package com.example.stage2.Service;

import com.example.stage2.Model.U;
import com.example.stage2.Repository.URepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UService {

//try catch
    private final URepository userrep;

    @Autowired
    public UService(URepository userrep) {
        this.userrep = userrep;
    }

    public List < U > getUsers() {
        return userrep.findAll();
    }

    public U getUser(long id){
        return userrep.findById (id).orElse (null);
    }

    public void deleteUser(long id){
        userrep.deleteById (id);
    }

    public void addUser(U u){
        userrep.save (u);
    }

    public void updateUser(U u){
        userrep.save (u);
    }
}
