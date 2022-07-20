package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");
        A a1 = (A) context.getBean("aref");

        System.out.println(a1.getX());
        System.out.println(a1.getOb().getY());
        System.out.println(a1);
    }
}
