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
    private long assignmentsId;
    private LocalDate assignmentDate;
    private LocalDate dueDate;
    private long topicId;

}
