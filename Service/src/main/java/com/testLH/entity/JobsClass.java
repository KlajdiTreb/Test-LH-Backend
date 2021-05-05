package com.testLH.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Jobs")
public class JobsClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private Date published;

    @JsonBackReference
    @OneToMany(mappedBy = "jobUser", cascade = CascadeType.ALL)
    private Set<UserClass> userClass;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public JobsClass() {}

    public JobsClass(int id, String name, String description, Date published, Set<UserClass> userClass) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.published = published;
        this.userClass = userClass;
    }

    public JobsClass(int id, String name, String description, Date published) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.published = published;
    }
}
