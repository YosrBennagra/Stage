package tn.ooredoo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ooredoo.models.User;
import tn.ooredoo.repositories.UserRepo;

import java.util.List;

@Service
public class UserService {


    private UserRepo userrep;

    @Autowired
    public UserService (UserRepo userrep) {
        this.userrep = userrep;
    }

    public List < User > getUsers ( ) {
        return (List < User >) userrep.findAll ( );
    }

    public User getUser (long id) {
        return userrep.findById (id).orElse (null);
    }

    public boolean authenticate(String login, String password) {
        try {
            User user = userrep.findByLoginAndPassword(login, password);
            return user != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false indicating authentication failed due to an error
        }
    }
    public void deleteUser (long id) {
        userrep.deleteById (id);
    }

    public void addUser (User u) {
        userrep.save (u);
    }

    public void updateUser (User u) {
        userrep.save (u);
    }
}