package com.learnbypractice.usage.springframework;

import com.learnbypractice.app.simple.component.EmployeeMapper;
import com.learnbypractice.app.simple.controller.EmployeeController;
import com.learnbypractice.app.simple.repository.EmployeeRepository;
import com.learnbypractice.app.simple.service.EmployeeService;
import com.learnbypractice.usage.configuration.InitializeControllerBeansWithConfigurationAndComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class InitializeControllerBeansWithConfigurationAndComponentScanApplication {

    /**
     * Showing how spring container is initialised in normal spring framework console application.
     */
    public static void main (String[] args) {
        /**
         * Create beans referred in configuration file.
         */
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(
                        InitializeControllerBeansWithConfigurationAndComponentScan.class);

        /**
         * Verify bean is created.
         */
        Assert.notNull(applicationContext.getBean(EmployeeController.class),
                "Bean (EmployeeController) should be created.");


        Assert.isTrue(
                applicationContext.getBeansOfType(EmployeeService.class).size() == 0,
                "Bean (EmployeeService) should not be created.");

        Assert.isTrue(
                applicationContext.getBeansOfType(EmployeeRepository.class).size() == 0,
                "Bean (EmployeeRepository) should not be created.");


        Assert.isTrue(
                applicationContext.getBeansOfType(EmployeeMapper.class).size() == 0,
                "Bean (EmployeeMapper) should not be created.");

    }
}
