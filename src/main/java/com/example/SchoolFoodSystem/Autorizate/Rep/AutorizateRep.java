package com.example.SchoolFoodSystem.Autorizate.Rep;


import com.example.SchoolFoodSystem.Autorizate.Entity.Autorizate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorizateRep extends JpaRepository<Autorizate, Long> {
}
