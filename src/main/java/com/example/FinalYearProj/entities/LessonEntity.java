package com.example.FinalYearProj.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lessons")
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lessonId")
    private long lessonId;
    @Column(name = "lessonName")
    private String lessonName;
    @Column(name = "duration")
    private long duration;
    @Column(name = "topicId")
    private long topicId;
}
