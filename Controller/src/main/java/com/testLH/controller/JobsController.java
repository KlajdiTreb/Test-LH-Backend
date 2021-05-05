package com.testLH.controller;

import com.testLH.entity.JobsClass;
import com.testLH.entity.UserClass;
import com.testLH.services.JobsServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "http://localhost:4200")
public class JobsController {

    private static final Logger logger = LoggerFactory.getLogger(JobsClass.class);

    @Autowired
    private JobsServices jobsServices;

    // CreatMapping
    @PostMapping(path = "/add", produces = "application/JSON")
    public JobsClass insertJob(@RequestBody JobsClass jobsClass) {
        return jobsServices.addJob(jobsClass);
    }

    // ReadMapping
    @GetMapping("/all")
    public List<JobsClass> getAllJobs() {
        logger.info("DISPLAYING ALL USERS!");
        return jobsServices.showAllJobs();
    }

    // ReadMapping by Description
    @GetMapping("/{name}")
    public JobsClass getJobByName(@PathVariable String name) throws Exception {
        if(name == null && !name.isEmpty())
            logger.info("WRONG NAME!");
        else
            logger.info("DISPLAYING JOB BY NAME");
        return jobsServices.getJobByName(name);
    }

    @PutMapping("/update")
    public JobsClass updateJob(@RequestBody JobsClass jobsClass) {
        if(jobsClass == null)
            logger.info("JOBCLASS: NULL");
        else
            logger.info("UPDATE JOB: SUCCESSFULLY");
        return jobsServices.updateJobs(jobsClass);
    }

    // DeleteMapping
    @DeleteMapping("/delete/{id}")
    public void deleteJob(@PathVariable int id) {
        if(id < 0)
            logger.info("NO NEGATIVE NUMBER AS ID!");
        else
            logger.info("THE JOB IS DELETED!");
        jobsServices.deleteJob(id);
    }
}
