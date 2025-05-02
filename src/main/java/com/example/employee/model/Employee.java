package com.example.employee.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String designation;

    private String dateOfBirth;

    @NotBlank
    private String fatherName;

    @NotBlank
    private String department;

    @NotBlank
    private String gender;

    private String spouseName;

    @NotBlank
    private String permanentAddress;

    private String temporaryAddress;

    private String avatarPath;
}