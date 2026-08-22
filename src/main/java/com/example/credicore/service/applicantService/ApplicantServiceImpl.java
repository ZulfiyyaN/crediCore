package com.example.credicore.service.applicantService;

import com.example.credicore.exception.ApplicantNotEligibleException;
import com.example.credicore.mapper.ApplicantMapper;
import com.example.credicore.model.entity.ApplicantEntity;
import com.example.credicore.model.request.ApplicantRequest;
import com.example.credicore.repository.ApplicantRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ApplicantServiceImpl implements ApplicantService {

    ApplicantMapper applicantMapper;
    ApplicantRepository applicantRepository;


    @Override
    public void createApplicant(ApplicantRequest request) {
        LocalDate birthDate = request.getBirthDate();
        int age = Period.between(birthDate, LocalDate.now()).getYears();

        if (age < 18) {
            throw new ApplicantNotEligibleException("Applicant must be at least 18 years old");
        }

        if (request.getMonthlyIncome() <= request.getTotalMonthlyDebt()) {
            throw new ApplicantNotEligibleException("Applicant income is not enough");
        }

        ApplicantEntity applicantEntity = applicantMapper.fromRequestToApplicant(request);
        applicantRepository.save(applicantEntity);
        log.info("Applicant created");

    }
}
