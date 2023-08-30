package tn.ooredoo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ooredoo.models.User;
import tn.ooredoo.repositories.UserRepo;

@Service
public class AuthenticationService {

    private final UserRepo userRepo;

    @Autowired
    public AuthenticationService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public boolean authenticate(String login, String password) {
        User user = userRepo.findByLoginAndPassword(login, password);
        return user != null;
    }
}
