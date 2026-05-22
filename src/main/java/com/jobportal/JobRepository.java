package com.jobportal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

    List<Job> findByTitleContainingIgnoreCaseOrCompanyContainingIgnoreCase(String title, String company);

}