package com.testLH.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "roleName")
    private String roleName;

    @JsonBackReference
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<UserClass> userClass;

    public int getId_role() {
        return id;
    }

    public void setId_role(int id_role) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<UserClass> getUserClass() {
        return userClass;
    }

    public void setUserClass(Set<UserClass> userClass) {
        this.userClass = userClass;
    }

    public Roles() {}

    public Roles(String roleName) {
        super();
        this.roleName = roleName;
    }
    public Roles(int id, String roleName) {
        super();
        this.id = id;
        this.roleName = roleName;
    }

    public Roles(int id, String roleName, Set<UserClass> userClass) {
        this.id = id;
        this.roleName = roleName;
        this.userClass = userClass;
    }
}
