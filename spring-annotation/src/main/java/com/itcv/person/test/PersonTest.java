package com.itcv.person.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itcv.config.MainConfig;
import com.itcv.config.MainConfig2;

public class PersonTest {

	@Test
	public void test01() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String beanNames [] = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName+" = beanName");
			
		}
	}
	
	/**
	 * scope
	 */
	@Test
	public void test02() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
		System.out.println("容器加载完成。。。。。。");
		Object bean1 = applicationContext.getBean("person");
		Object bean2 = applicationContext.getBean("person");
		System.out.println(bean1 == bean2);
		
	}
	
	/**
	 * condition
	 */
	@Test
	public void test03() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
		String beanNames [] = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName+" = beanName");
			
		}
		
	}
	
}
