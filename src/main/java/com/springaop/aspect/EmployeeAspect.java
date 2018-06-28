package com.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	// The String expression in the @Before annotation is called as pointcut
	@Before("execution(public String getName())")
	public  void getNameAdvice(){
		
		System.out.println("Executing advice on getName() method");
	}
	
	//getAllAdvice() will be applied for all the classes in 
	//com.journaldev.spring.service package whose name starts with get 
	//and doesn’t take any arguments.
	@Before("execution(* com.springaop.service.*.get*())")
	public void getAllAdvice(){
		System.out.println("Executing advice on all getters in service package");
	}
}
