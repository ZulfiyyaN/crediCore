package com.example.credicore.mapper;

import com.example.credicore.model.entity.ApplicantEntity;
import com.example.credicore.model.request.ApplicantRequest;
import org.springframework.stereotype.Component;

@Component
public class ApplicantMapper {

    public ApplicantEntity fromRequestToApplicant(ApplicantRequest request) {
        ApplicantEntity entity = new ApplicantEntity();
        entity.setFinCode(request.getFinCode());
        entity.setFirstName(request.getFirstName());
        entity.setLastName(request.getLastName());
        entity.setBirthDate(request.getBirthDate());
        entity.setMonthlyIncome(request.getMonthlyIncome());
        entity.setTotalMonthlyDebt(request.getTotalMonthlyDebt());
        entity.setWorkExperienceMonth(request.getWorkExperienceMonth());
        return entity;
    }
}
