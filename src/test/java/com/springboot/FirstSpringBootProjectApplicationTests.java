package com.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
class FirstSpringBootProjectApplicationTests {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FirstSpringBootProjectApplicationTests.class);
		UserSetter userBySett = (UserSetter) context.getBean("userSetter");

		userBySett.iphone.actionOnPress();

		UserConstructor userByConst = (UserConstructor) context.getBean("userConstructor");

		userByConst.iphone.actionOnHold();
	}
}


