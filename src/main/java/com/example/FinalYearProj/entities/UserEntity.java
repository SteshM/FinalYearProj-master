package com.example.FinalYearProj.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userId")
    private long userId;
    @Column(name="fullName")
    private String fullName;
    @Column(unique = true,name = "email")
    private String email;
    @Column(nullable = false,name="password")
    private String password;
    @Column(name="dateOfBirth")
    private String dateOfBirth;
//    @Column(name="userId")
//    private long userTypeId;
    @Column(name="role")
    private String role;

}
