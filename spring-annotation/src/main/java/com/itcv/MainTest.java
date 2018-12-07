package com.itcv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
import com.itcv.config.MainConfig;
import com.itcv.person.bean.Person;

public class MainTest {
   @SuppressWarnings("resource")
    public static void main(String[] args) {
	 
	 /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	  Person bean = (Person) applicationContext.getBean("person");
	  System.out.println(bean.getName());*/
	   ApplicationContext applicationContext = new AnnotationConfigApplicationContext (MainConfig.class);
	   Person bean = applicationContext.getBean(Person.class);
	   System.out.println(bean.toString());
	   
}
}
