package com.example.credicore.service.applicantService;

import com.example.credicore.mapper.ApplicantMapper;
import com.example.credicore.model.entity.ApplicantEntity;
import com.example.credicore.model.request.ApplicantRequest;
import com.example.credicore.repository.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ApplicantServiceImpl implements ApplicantService {

    ApplicantMapper applicantMapper;
    ApplicantRepository applicantRepository;


    @Override
    public void createApplicant(ApplicantRequest request) {
        ApplicantEntity applicantEntity = applicantMapper.fromRequestToApplicant(request);
        applicantRepository.save(applicantEntity);
        log.info("Applicant created");

    }
}
