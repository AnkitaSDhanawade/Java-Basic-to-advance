package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext();
		Emp emp1=(Emp)context.getBean("emp1",Emp.class);
		System.out.println(emp1);
	}

}
