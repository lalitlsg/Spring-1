package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireConfig.xml");
        Emp e = context.getBean("emp", Emp.class);
        System.out.println(e);
    }
}
