package com.example.FinalYearProj.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "subjects")
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subjectId")
    private long subjectId;
    @Column(name = "subjectName")
    private String subjectName;
    @Column(name = "levelId")
    private long levelId;
}
