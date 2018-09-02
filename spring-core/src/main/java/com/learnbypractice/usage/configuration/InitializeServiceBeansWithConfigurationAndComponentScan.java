package com.learnbypractice.usage.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

/**
 *
 * This configuration class is added to show how beans can be created with annotation @ComponentScan.
 *
 * Notice @ComponentScan can only be used in conjugation with @Configuration.
 *
 * This configuration class scans the given package ,
 * reads all classes annotated with Service annotation and instantiates Beans.
 *
 *
 * Check {@link - InitializeServiceBeansWithConfigurationAndComponentScanTest} in tests  and
 * {@link  com.learnbypractice.usage.springframework.InitializeServiceBeansWithConfigurationAndComponentScanApplication}
 * in main spring framework application
 *
 */
@Configuration
@ComponentScan(
        basePackages = "com.learnbypractice.app.simple",
        useDefaultFilters = false,
        includeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value = Service.class
        )
)
public class InitializeServiceBeansWithConfigurationAndComponentScan {
}
