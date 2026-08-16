package com.example.credicore.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "applicants")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "fin_code", nullable = false)
    String finCode;
    @Column(name = "first_name", nullable = false, unique = true)
    String firstName;
    @Column(name = "last_name", nullable = false)
    String lastName;
    @Column(name = "monthly_income", nullable = false)
    Integer monthlyIncome;
    @Column(name = "total_monthly_debt", nullable = false)
    Integer totalMonthlyDebt;
    @Column(name = "work_experience_month", nullable = false)
    Integer workExperienceMonth;
    @Column(name = "birth_date", nullable = false)
    LocalDate birthDate;
}
