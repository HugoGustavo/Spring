package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean(initMethod="init", destroyMethod="cleanup")
	@Scope("single")
	public Foo foo() {
		return new Foo();
	}
}
