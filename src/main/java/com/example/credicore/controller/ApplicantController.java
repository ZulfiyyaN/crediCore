package com.example.credicore.controller;

import com.example.credicore.model.request.ApplicantRequest;
import com.example.credicore.service.applicantService.ApplicantService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/applicant")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ApplicantController {
    ApplicantService applicantService;


    @PostMapping("/create_applicant")
    public ResponseEntity<Void> createApplicant(@Valid @RequestBody ApplicantRequest request) {
        applicantService.createApplicant(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }


}
