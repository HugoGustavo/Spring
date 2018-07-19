package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static ApplicationContext applicationContext;
	//private static AbstractApplicationContext abstractApplicationContext;
	//private static AnnotationConfigApplicationContext annotationConfigApplicationContext;
	//private static ConfigurableApplicationContext configurableApplicationContext;
	
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Student student = (Student) applicationContext.getBean("student");
		student.getName();
		student.getAge();
		student.printThrowException();
	}
}
