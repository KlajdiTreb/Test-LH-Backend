package com.testLH.repository;

import com.testLH.entity.JobsClass;
import com.testLH.entity.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserClass, Integer> {
}
