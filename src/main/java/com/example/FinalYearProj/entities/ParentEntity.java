package com.example.FinalYearProj.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "parents")
public class ParentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parentId")
    public long parentId;
    @Column(name = "parentContact")
    public long parentContact;
    @Column(name = "parentIdNo")
    public long parentIdNo;

}
