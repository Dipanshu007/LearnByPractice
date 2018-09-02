package com.learnbypractice.app.simple.repository;


import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public EmployeeRepository() {
        System.out.println("I am in EmployeeRepository marked with repository");
    }
}
