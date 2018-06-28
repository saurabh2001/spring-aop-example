package com.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {

	@Pointcut("execution(public String getName())")
	public void getNamePointcut(){}
	
	//Pointcut to execute on all the methods of classes in a package
	@Pointcut("within(com.springaop.service.*)")
	public void allMethodsInAPackagePointcut(){}
		
	@Before("getNamePointcut()")
	public void loggingAdvice(){
		System.out.println("Executing loggingAdvice on getName()");
	}
	
	@Before("getNamePointcut()")
	public void secondAdvice(){
		System.out.println("Executing secondAdvice on getName()");
	}
	
	
	
	@Before("allMethodsInAPackagePointcut()")
	public void allServiceMethodsAdvice(){
		System.out.println("Before executing service method");
	}
	
	
}
