package com.jihaox.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Pointcut(value="execution(* com.jihaox.spring.Person.*(..))")
	public void log(){}

	@Before(value="execution(* com.jihaox.spring.Person.*(..)) && args(name, age)",argNames = "joinPoint,age, name")
	public void logBefore(JoinPoint joinPoint, int age, String name) {

		System.out.println("name is " + name);
		System.out.println("Log before the method");
	}
}
