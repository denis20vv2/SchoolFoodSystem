package com.example.SchoolFoodSystem.History.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_history")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String order_id;

    private String dish_id;

    private String dish_name;

    private String caloric_value;

    private String price;

    private String status;

}
