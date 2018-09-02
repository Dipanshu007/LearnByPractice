package com.learnbypractice.usage.configuration;

import com.learnbypractice.app.simple.component.EmployeeMapper;
import com.learnbypractice.app.simple.controller.EmployeeController;
import com.learnbypractice.app.simple.repository.EmployeeRepository;
import com.learnbypractice.app.simple.service.EmployeeService;
import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =
        InitializeComponentBeansWithConfigurationAndComponentScan.class)
public class InitializeComponentBeansWithConfigurationAndComponentScanTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void allComponentBeansAreInitialised() {

        /*
            Classes annotated with Service, Controller, Component and Repository
            are initialised.
         */
        Assertions.assertThat(applicationContext.getBean(EmployeeMapper.class)).isNotNull();

        Assertions.assertThat(applicationContext.getBean(EmployeeService.class)).isNotNull();

        Assertions.assertThat(applicationContext.getBean(EmployeeRepository.class)).isNotNull();

        Assertions.assertThat(applicationContext.getBean(EmployeeController.class)).isNotNull();
    }
}