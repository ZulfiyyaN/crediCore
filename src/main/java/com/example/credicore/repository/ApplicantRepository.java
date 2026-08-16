package com.example.credicore.repository;

import com.example.credicore.model.entity.ApplicantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<ApplicantEntity, Long> {
}
