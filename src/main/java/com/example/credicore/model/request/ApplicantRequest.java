package com.example.credicore.model.request;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

import java.time.LocalDate;
@Getter
public class ApplicantRequest {
    String finCode;
    @NotBlank
    String firstName;
    @NotBlank
    String lastName;
    @NotBlank
    LocalDate birthDate;
    @NotBlank
    Integer monthlyIncome;
    @NotBlank
    Integer totalMonthlyDebt;
    @NotBlank
    Integer workExperienceMonth;

}
