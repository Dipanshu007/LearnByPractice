package com.learnbypractice.usage.configuration;

import com.learnbypractice.app.simple.component.EmployeeMapper;
import com.learnbypractice.app.simple.controller.EmployeeController;
import com.learnbypractice.app.simple.repository.EmployeeRepository;
import com.learnbypractice.app.simple.service.DepartmentService;
import com.learnbypractice.app.simple.service.EmployeeService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =
        InitializeControllerBeansWithConfigurationAndComponentScan.class)
public class InitializeControllerBeansWithConfigurationAndComponentScanTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void controllerBeansAreInitialised() {

        /*
            Classes present in the given package and marked with Controller are Instantiated
         */
        Assertions.assertThat(applicationContext.getBean(EmployeeController.class)).isNotNull();

        Assertions.assertThatExceptionOfType(NoSuchBeanDefinitionException.class).
                isThrownBy(() -> applicationContext.getBean(EmployeeService.class));

        Assertions.assertThatExceptionOfType(NoSuchBeanDefinitionException.class).
                isThrownBy(() -> applicationContext.getBean(EmployeeMapper.class));

        Assertions.assertThatExceptionOfType(NoSuchBeanDefinitionException.class).
                isThrownBy(() -> applicationContext.getBean(EmployeeRepository.class));

    }

}