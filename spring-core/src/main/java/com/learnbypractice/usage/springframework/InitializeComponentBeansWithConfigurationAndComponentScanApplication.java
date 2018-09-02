package com.learnbypractice.usage.springframework;

import com.learnbypractice.app.simple.component.EmployeeMapper;
import com.learnbypractice.app.simple.controller.EmployeeController;
import com.learnbypractice.app.simple.repository.EmployeeRepository;
import com.learnbypractice.app.simple.service.EmployeeService;
import com.learnbypractice.usage.configuration.InitializeComponentBeansWithConfigurationAndComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class InitializeComponentBeansWithConfigurationAndComponentScanApplication {


/**
 * Showing how spring container is initialised in normal spring framework console application.
 */
public static void main (String[] args) {
    /**
     * Create beans referred in configuration file.
     */
    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(
                    InitializeComponentBeansWithConfigurationAndComponentScan.class);

    /**
     * Verify bean is created.
     */
    Assert.notNull(applicationContext.getBean(EmployeeController.class),
            "Bean (EmployeeController) should be created.");


    Assert.notNull(applicationContext.getBean(EmployeeService.class),
            "Bean (EmployeeService) should be created.");


    Assert.notNull(applicationContext.getBean(EmployeeRepository.class),
            "Bean (EmployeeRepository) should be created.");


    Assert.notNull(applicationContext.getBean(EmployeeMapper.class),
            "Bean (EmployeeMapper) should be created.");

}
}
