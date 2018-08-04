package com.learnbypractice.usage.springframework;

import com.learnbypractice.service.EmployeeService;
import com.learnbypractice.usage.configuration.InitializeBeansWithConfiguration;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;


/**
 * Usage of configuration on normal spring application.
 *
 * This shows how spring container is initialised when configuration file is passed.
 *
 * Here InitializeBeansWithConfiguration (annotated with @configuration)
 * refers to classes to be created as spring beans..
 *
 *
 */
public class InitializeBeansWithConfigurationApplication {


    /**
     * Showing how spring container is initialised in normal spring framework console application.
     */
    public static void main (String[] args) {
        /**
         * Create beans referred in configuration file.
         */
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(InitializeBeansWithConfiguration.class);

        /**
         * Verify bean is created.
         */
        Assert.notNull(applicationContext.getBean(EmployeeService.class),
                "Bean (EmployeeService) should be created.");

    }
}
