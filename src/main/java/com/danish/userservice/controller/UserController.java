package com.danish.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/users")
    public ArrayList<String> getUsers(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Danish");
        names.add("Heena");
        names.add("Afreen");
        names.add("Bushra");
        return names;
    }
}
