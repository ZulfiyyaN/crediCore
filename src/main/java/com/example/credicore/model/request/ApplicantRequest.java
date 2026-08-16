package com.example.credicore.model.request;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class ApplicantRequest {
    String finCode;
    @NotBlank
    String firstName;
    @NotBlank
    String lastName;
    @NotBlank
    Integer monthlyIncome;
    @NotBlank
    Integer totalMonthlyDebt;
    @NotBlank
    Integer workExperienceMonth;
    @NotBlank
    LocalDate birthDate;
}
