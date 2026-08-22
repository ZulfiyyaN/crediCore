package com.example.credicore.model.request;

import jakarta.validation.constraints.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class ApplicantRequest {
    @NotBlank(message = "FinCode is can not be blank")
    @Size(message = "FinCode must be exactly 7 characters")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "FinCode must contain only letters and digits")
    String finCode;
    @NotBlank(message = "First name can not be blank")
    String firstName;
    @NotBlank(message = "Last name can not be blank")
    String lastName;
    @NotBlank
    @Past(message = "Date of birth should be past")
    LocalDate birthDate;
    @NotNull
    @PositiveOrZero(message = "Monthly income cannot be negative")
    Integer monthlyIncome;
    @NotNull
    @PositiveOrZero(message = "Total monthly debt cannot be negative")
    Integer totalMonthlyDebt;
    @NotNull
    Integer workExperienceMonth;

}
