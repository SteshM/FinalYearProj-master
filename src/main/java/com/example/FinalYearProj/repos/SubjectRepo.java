package com.example.FinalYearProj.repos;

import com.example.FinalYearProj.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepo extends JpaRepository<SubjectEntity , Long> {

    List<SubjectEntity> findByLevelName(String levelName);

    List<SubjectEntity> findByGradeName(String gradeName);
}
