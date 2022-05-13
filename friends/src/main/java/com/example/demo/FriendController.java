package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class FriendController {
    @Autowired
    FriendRepository friendRepository;

    @GetMapping(name="/")
    public Iterable<Friend> get(){
        return friendRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Friend> get(@PathVariable String id){
        return friendRepository.findById(id);
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
