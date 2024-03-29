package com.example.FinalYearProj.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AssignmentDTO {
    private long assignmentId;

    private LocalDate assignmentDate;

    private LocalDate dueDate;

    private String googleFormLink;

    private long topicId;
}
