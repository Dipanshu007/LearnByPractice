package com.learnbypractice.usage.configuration;

import com.learnbypractice.service.DepartmentService;
import com.learnbypractice.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * This configuration class is added to show how beans can be created with annotation @Beans.
 *
 * Notice @Bean can be used in conjugation with @Configuration.
 *
 * This is one way to create spring beans. i.e. @Beans in @configuration class.
 *
 *
 * Check {@link - InitializeBeansWithConfigurationTest} in tests  and
 * {@link  com.learnbypractice.usage.springframework.InitializeBeansWithConfigurationApplication}
 * in main spring framework application
 *
 */
@Configuration
public class InitializeBeansWithConfiguration {

    /**
     *
     * method create new bean
     *
     */
    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService();
    }


    /**
     *
     * Method to create new object but it will not create new bean.
     */
    public DepartmentService departmentService() {
        return new DepartmentService();
    }

}
