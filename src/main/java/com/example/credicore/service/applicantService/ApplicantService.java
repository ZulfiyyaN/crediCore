package com.example.credicore.service.applicantService;

import com.example.credicore.model.request.ApplicantRequest;

import java.math.BigDecimal;

public interface ApplicantService {


    public void createApplicant(ApplicantRequest request);

    public BigDecimal calculateBGN(Double income, Double debt);

}
