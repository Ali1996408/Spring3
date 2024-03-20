package ru.kours.springstudents.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;

    private String lastName;

    private LocalDate dateofBirth;
@Column(unique = true)
    private String  email;
@Transient
    private int    age;



}
