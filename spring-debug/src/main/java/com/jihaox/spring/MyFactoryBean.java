package com.jihaox.spring;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Person> {
	@Override
	public Person getObject() throws Exception {

		Person p = new Person();
		p.setName("FactoryBean Person");
		return p;
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
