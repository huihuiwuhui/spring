package com.itcv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.itcv.person.bean.Person;

 

@Configuration  //告诉spring这是一个配置类
@ComponentScan(value="com.itcv",
	//excludeFilters = {
			//@Filter(type=FilterType.ANNOTATION, value= {Controller.class,Service.class}), //排除包含Controller,service注解的类
			
			//}
	includeFilters = {
			@Filter(type=FilterType.CUSTOM,value=MyFilterType.class)
	},useDefaultFilters = true
		) //扫描包
public class MainConfig {
  
	@Bean
	public Person person01() {
		
		return new Person("李四",20);
	}
	
	
}
