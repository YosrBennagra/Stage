package com.stagejv8.Stagejv8.Repository;

import com.stagejv8.Stagejv8.Model.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository < User, Long> {
}
