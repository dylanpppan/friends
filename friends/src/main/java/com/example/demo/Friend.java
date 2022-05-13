package com.example.demo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="friends")
public class Friend {
    @Id
    private String id;
    private String name;
    private String bday;
    private String food;
    private String animal;
    private String comment;
}
