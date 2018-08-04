package com.learnbypractice.usage.configuration;


import com.learnbypractice.service.DepartmentService;
import com.learnbypractice.service.EmployeeService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = InitializeBeansWithConfiguration.class)
public class InitializeBeansWithConfigurationTest {


    @Autowired
    ApplicationContext applicationContext;


    @Test
    public void beansAreInitialised_whenDefinedInConfiguration() {

        /*
            Beans which are referred in configuration file given in @contextConfiguration
            are only initialised.
         */
        Assertions.assertThat(applicationContext.getBean(EmployeeService.class)).isNotNull();

        /**
         *  When Bean is not initialised because method is not annotated with @Bean.
         */
        Assertions.assertThatExceptionOfType(NoSuchBeanDefinitionException.class).
                isThrownBy(() -> applicationContext.getBean(DepartmentService.class));
    }

}


