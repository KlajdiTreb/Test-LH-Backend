package com.testLH.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class UserClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    @ManyToOne(optional = false)
    @JoinColumn(name = "roleId")
    private Roles role;

    @ManyToOne
    @JoinColumn(name = "jobId")
    private JobsClass jobUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public JobsClass getJobUser() {
        return jobUser;
    }

    public void setJobUser(JobsClass jobUser) {
        this.jobUser = jobUser;
    }

    public UserClass() {}

    public UserClass(int id, String name, String lastname, String username, String password, Roles role, JobsClass jobUser) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.role = role;
        this.jobUser = jobUser;
    }
}
