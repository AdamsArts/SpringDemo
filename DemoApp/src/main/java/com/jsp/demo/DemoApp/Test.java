package com.jsp.demo.DemoApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Car car=context.getBean("myCar", Car.class);
		car.start();
		System.out.println(car.getBrand());
		

		
	}

}
