package com.example.SchoolFoodSystem.Autorizate.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Table(name = "autorizate")
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autorizate {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String login;

    private String password;

    private String rule;

    private String name;

}
