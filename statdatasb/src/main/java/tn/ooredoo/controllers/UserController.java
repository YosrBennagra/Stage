package tn.ooredoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.ooredoo.models.AuthRequest;
import tn.ooredoo.models.User;
import tn.ooredoo.services.AuthenticationService;
import tn.ooredoo.services.UserService;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/auth")
public class UserController {

    private final AuthenticationService authenticationService;
    private final UserService userService;
    @Autowired
    public UserController(AuthenticationService authenticationService,UserService userService) {
        this.authenticationService = authenticationService;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity< Map <String, Boolean> > login(@RequestBody AuthRequest authRequest) {
        boolean isAuthenticated = authenticationService.authenticate(authRequest.getLogin(), authRequest.getPassword());
        Map<String, Boolean> response = new HashMap <> ();
        response.put("success", isAuthenticated);

        if (isAuthenticated) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }

    @PostMapping("/adduser")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        try {
            userService.addUser(user);
            return ResponseEntity.ok("User added successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while adding the user");
        }
    }
}
