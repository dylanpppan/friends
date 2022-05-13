package com.example.demo;


import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface FriendRepository extends JpaRepository<Friend, String> {
}
