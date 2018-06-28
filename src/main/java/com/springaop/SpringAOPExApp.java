package com.springaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class SpringAOPExApp 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        System.out.println("Name of the employee is : "+employeeService.getEmployee());
        System.out.println("Name of the employee is : "+employeeService.getEmployee().getName());
        
        employeeService.getEmployee().setName("Joe");
        
       // employeeService.getEmployee().throwException();
        
        context.close();
        
    }
}
