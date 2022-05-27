package com.jihaox.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.PessimisticLockingFailureException;

public class NewEntryPoint {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-test.xml");
		Person p = applicationContext.getBean("person",Person.class);
		System.out.println(p.getName());
		System.out.println("AAAAAAAAAAAAA");
		p.getTestNames("Chirs", 26);
		Person p1 = applicationContext.getBean("factoryPerson",Person.class);
		System.out.println(p1);
	}
}
