package com.example.FinalYearProj.repos;

import com.example.FinalYearProj.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity , Long> {
  List<StudentEntity> findByGradeName(String GradeName);

}
