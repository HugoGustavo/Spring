package com.tutorialspoint;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	private String message1;
	private String message2;
	private String message3;
	
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	
	public void getMessage1() {
		System.out.println("Your message: " + message1);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

	public void getMessage2() {
		System.out.println("World Message 2: " + message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getMessage3() {
		return message3;
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}
}
