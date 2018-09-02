package com.learnbypractice.app.simple.component;


import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public EmployeeMapper() {
        System.out.println("I am in EmployeeMapper marked with component");
    }
}
