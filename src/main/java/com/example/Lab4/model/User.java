package com.example.Lab4.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
