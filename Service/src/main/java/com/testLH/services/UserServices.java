package com.testLH.services;

import com.testLH.entity.UserClass;
import com.testLH.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public UserClass addUser(UserClass userClass) {
        System.out.println("UserClass: " + userClass);
        return userRepository.save(userClass);
    }
    public UserClass getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserClass updateUser(UserClass userClass) {
        int id = userClass.getId();
        UserClass existingUser = userRepository.findById(id).orElse(null);
        existingUser.setName(userClass.getName());
        existingUser.setLastname(userClass.getLastname());
        existingUser.setUsername(userClass.getUsername());
        existingUser.setPassword(userClass.getPassword());

        return userRepository.save(existingUser);
    }


    public List<UserClass> findUser(String username, String password) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<UserClass> criteriaQuery = criteriaBuilder.createQuery(UserClass.class);

        Root<UserClass> root = criteriaQuery.from(UserClass.class);
        criteriaQuery.where(
                criteriaBuilder.like(root.get("username"), "%" + username + "%"),
                criteriaBuilder.like(root.get("password"), "%" + password + "%")
        );
        List<UserClass> allUsers = entityManager.createQuery(criteriaQuery).getResultList();

        return allUsers;
    }



}
