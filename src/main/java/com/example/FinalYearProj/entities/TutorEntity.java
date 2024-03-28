package com.example.FinalYearProj.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tutors")
public class TutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tutorId")
    private long tutorId;
    @Column(name="empNo")
    private String empNo;
    @Column(name="tutorContactNo")
    private long tutorContactNo;
    @Column(name="tutorIdNo")
    private long tutorIdNo;
    @Column(name="subjectId")
    private long subjectId;
}
