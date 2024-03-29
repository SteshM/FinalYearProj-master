package com.example.FinalYearProj.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "assignments")
public class AssignmentsEntity {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignmentsId")
    private long assignmentsId;
    @Column(name = "assignmentDate")
    private LocalDate assignmentDate;
    @Column(name = "dueDate")
    private LocalDate dueDate;
    @Column(name="googleFormLink")
    private String googleFormLink;
    @Column(name = "topicsId")
    private long topicId;

}
