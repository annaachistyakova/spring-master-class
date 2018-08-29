package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		/*
		 * Both of below statements get same object, if there is no
		 *  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) in BinarySearchImpl
		 *  so this bean is singleton by default
		 */
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = 
				applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
	}
}
