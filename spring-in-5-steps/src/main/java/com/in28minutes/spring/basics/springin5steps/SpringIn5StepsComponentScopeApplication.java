package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.componentscan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsComponentScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScopeApplication.class);

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScopeApplication.class, args);

		ComponentPersonDAO componentPersonDAO = applicationContext.getBean(ComponentPersonDAO.class);

		ComponentPersonDAO componentPersonDAO2 = applicationContext.getBean(ComponentPersonDAO.class);

		LOGGER.info("{}", componentPersonDAO);
		LOGGER.info("{}", componentPersonDAO.getJdbcConnection());

		LOGGER.info("{}", componentPersonDAO2);
		LOGGER.info("{}", componentPersonDAO2.getJdbcConnection());
	}

}
