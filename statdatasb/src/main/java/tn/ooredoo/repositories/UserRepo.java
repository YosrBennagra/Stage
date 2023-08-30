package tn.ooredoo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ooredoo.models.User;

public interface UserRepo extends JpaRepository < User, Long> {
    User findByLoginAndPassword(String login, String password);
}
