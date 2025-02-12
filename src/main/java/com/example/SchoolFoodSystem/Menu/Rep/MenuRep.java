package com.example.SchoolFoodSystem.Menu.Rep;

import com.example.SchoolFoodSystem.Admin.Entity.Admin;
import com.example.SchoolFoodSystem.Menu.Entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRep extends JpaRepository<Menu, Long> {
}
