package com.example.Dependency_Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DependencyInjectionApplication.class, args);
		// Dev obj=new Dev();
		// obj.build();
		ApplicationContext context=SpringApplication.run(DependencyInjectionApplication.class, args);
        Dev obj=context.getBean(Dev.class);
		obj.build();
	}
}
