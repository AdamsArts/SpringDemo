package com.mipl.DemoAp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Employee setters=context.getBean("myEmp", Employee.class);
		Employee contructor=context.getBean("myEmp2", Employee.class);
		
		setters.print();
		contructor.print();
		
	}

}
