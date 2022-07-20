package com.springcore.constructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConTest {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("constructorInjConfig.xml");
        Person p1 = (Person) context.getBean("person");
        Add add = (Add) context.getBean("add");

        System.out.println(p1);
        add.sum();
    }
}
