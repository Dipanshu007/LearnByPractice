package com.learnbypractice.usage.springframework;

import com.learnbypractice.app.simple.component.EmployeeMapper;
import com.learnbypractice.app.simple.controller.EmployeeController;
import com.learnbypractice.app.simple.repository.EmployeeRepository;
import com.learnbypractice.app.simple.service.EmployeeService;
import com.learnbypractice.usage.configuration.InitializeAllBeansWithConfigurationAndComponentScan;
import com.learnbypractice.usage.configuration.InitializeServiceBeansWithConfigurationAndComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class InitializeServiceBeansWithConfigurationAndComponentScanApplication {

    /**
     * Showing how spring container is initialised in normal spring framework console application.
     */
    public static void main (String[] args) {
        /**
         * Create beans referred in configuration file.
         */
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(InitializeServiceBeansWithConfigurationAndComponentScan.class);

        /**
         * Verify bean is created.
         */
        Assert.notNull(applicationContext.getBean(EmployeeService.class),
                "Bean (EmployeeService) should be created.");


        Assert.isTrue(
                applicationContext.getBeansOfType(EmployeeController.class).size() == 0,
                "Bean (EmployeeController) should not be created.");

        Assert.isTrue(
                applicationContext.getBeansOfType(EmployeeRepository.class).size() == 0,
                "Bean (EmployeeRepository) should not be created.");


        Assert.isTrue(
                applicationContext.getBeansOfType(EmployeeMapper.class).size() == 0,
                "Bean (EmployeeMapper) should not be created.");

    }
}
