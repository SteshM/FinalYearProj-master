package com.example.FinalYearProj.repos;

import com.example.FinalYearProj.entities.AssignmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentsRepo extends JpaRepository<AssignmentsEntity, Long> {
}
