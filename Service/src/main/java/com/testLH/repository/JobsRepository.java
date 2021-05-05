package com.testLH.repository;

import com.testLH.entity.JobsClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<JobsClass, Integer> {
    JobsClass findByName(String name);
}
