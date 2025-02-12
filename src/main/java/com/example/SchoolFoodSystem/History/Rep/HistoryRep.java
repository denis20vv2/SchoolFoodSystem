package com.example.SchoolFoodSystem.History.Rep;

import com.example.SchoolFoodSystem.History.Entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRep extends JpaRepository<History, Long> {
}
