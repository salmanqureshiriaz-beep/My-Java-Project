package com.FirstProject.JavaLearner.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Detail")
public class Student {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;
    private String city;

    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public Student(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}