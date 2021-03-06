package com.learnbypractice.usage.configuration;

import com.learnbypractice.app.simple.component.EmployeeMapper;
import com.learnbypractice.app.simple.controller.EmployeeController;
import com.learnbypractice.app.simple.repository.EmployeeRepository;
import com.learnbypractice.app.simple.service.EmployeeService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = InitializeAllBeansWithConfigurationAndComponentScan.class)
public class InitializeAllBeansWithConfigurationAndComponentScanTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void beansAreInitialised() {

        /*
            Beans which are referred in configuration file given in @contextConfiguration
            are only initialised.
         */
        Assertions.assertThat(applicationContext.getBean(EmployeeService.class)).isNotNull();


        Assertions.assertThat(applicationContext.getBean(EmployeeController.class)).isNotNull();


        Assertions.assertThat(applicationContext.getBean(EmployeeMapper.class)).isNotNull();


        Assertions.assertThat(applicationContext.getBean(EmployeeRepository.class)).isNotNull();

    }

}
