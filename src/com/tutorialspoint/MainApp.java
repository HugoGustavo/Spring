package com.tutorialspoint;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static ApplicationContext applicationContext;
	private static Logger log = Logger.getLogger(MainApp.class.getName());
	//private static AbstractApplicationContext abstractApplicationContext;
	//private static AnnotationConfigApplicationContext annotationConfigApplicationContext;
	//private static ConfigurableApplicationContext configurableApplicationContext;
	
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		log.info("Going to create JDBC Template");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) applicationContext.getBean("studentJDBCTemplate");
		System.out.println("------Records Creation--------" );
		studentJDBCTemplate.create("Zara",11);
		studentJDBCTemplate.create("Nuha", 2);
		studentJDBCTemplate.create("Ayan", 15);
		
		System.out.println("------Listing Multiple Records--------" );
		List<Student> students = studentJDBCTemplate.listStudents();
		
		for (Student record : students) {
			System.out.print("ID : " + record.getId() );
			System.out.print(", Name : " + record.getName() );
			System.out.println(", Age : " + record.getAge());
		}
		log.info("Going to update JDBC Template");
		System.out.println("----Updating Record with ID = 2 -----" );
		studentJDBCTemplate.update(2, 20);

		System.out.println("----Listing Record with ID = 2 -----" );
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.print("ID : " + student.getId() );
		System.out.print(", Name : " + student.getName() );
		System.out.println(", Age : " + student.getAge());
	}
}
