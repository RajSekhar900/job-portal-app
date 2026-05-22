package com.jobportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jobportal.model.Job;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JobportalApplication {

    @Autowired
    private JobRepository jobRepository;

    public static void main(String[] args) {
        SpringApplication.run(JobportalApplication.class, args);
    }

    @PostConstruct
    public void insertData() {
        Job job = new Job();
        job.setTitle("Java Developer");
        job.setCompany("TCS");
        job.setLocation("Kolkata");
        job.setDescription("Backend Developer Role");

        jobRepository.save(job);

        System.out.println("DATA INSERTED SUCCESSFULLY");
    }
}