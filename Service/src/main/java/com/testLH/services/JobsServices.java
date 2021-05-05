package com.testLH.services;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import com.testLH.entity.JobsClass;
import com.testLH.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.List;

@Service
public class JobsServices {

    @Autowired
    private JobsRepository jobsRepository;

    // Create Job
    public JobsClass addJob(JobsClass jobsClass) {
        Date date = Date.valueOf(LocalDate.now());
        jobsClass.setPublished(date);
        return jobsRepository.save(jobsClass);
    }

    // Read Job
    public List<JobsClass> showAllJobs() {
        return jobsRepository.findAll();
    }

    // Read Job by Name
    public JobsClass getJobByName(String name) {
        return jobsRepository.findByName(name);
    }

    public JobsClass updateJobs(JobsClass jobsClass) {
        int id = jobsClass.getId();
        JobsClass jobsClass1 = jobsRepository.findById(id).orElse(null);

        jobsClass1.setName(jobsClass.getName());
        jobsClass1.setDescription(jobsClass.getDescription());

        return jobsRepository.save(jobsClass1);
    }

    // Delete Job
    public String deleteJob(int id) {
        jobsRepository.deleteById(id);
        return "Job: Deleted!";
    }
}
