package com.example.FinalYearProj.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "grades")
public class GradeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gradeId")
    private long gradeId;
    @Column(name = "gradeName")
    private String gradeName;
    @Column (name="levelId")
    private long levelId;


}
