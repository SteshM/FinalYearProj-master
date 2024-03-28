package com.example.FinalYearProj.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentId")
    private long studentId;
    @Column(name="admNo")
    private String admNo;
    @Column(name="parentId")
    private long parentId;
    @Column(name="levelId")
    private long levelId;
}
