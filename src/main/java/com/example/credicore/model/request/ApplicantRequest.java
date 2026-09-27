package com.example.credicore.model.request;

import jakarta.validation.constraints.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class ApplicantRequest {
    @NotBlank(message = "FinCode is can not be blank")
    @Size(min = 7, max = 7, message = "FinCode must be exactly 7 characters")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "FinCode must contain only letters and digits")
    String finCode;
    @NotBlank(message = "First name can not be blank")
    String firstName;
    @NotBlank(message = "Last name can not be blank")
    String lastName;
    @NotNull(message = "Birth Date can not be null!")
    @Past(message = "Date of birth should be past")
    LocalDate birthDate;
    @NotNull(message = "Monthly income can not be null!")
    @PositiveOrZero(message = "Monthly income cannot be negative")
    Integer monthlyIncome;
    @NotNull(message = "Total monthly debt can not be null!")
    @PositiveOrZero(message = "Total monthly debt cannot be negative")
    Integer totalMonthlyDebt;
    @NotNull(message = "Work experience can not be null!")
    @PositiveOrZero(message = "Work experience can not be negative!")
    Integer workExperienceMonth;

}
