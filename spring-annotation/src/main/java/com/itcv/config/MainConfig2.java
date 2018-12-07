package com.itcv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.itcv.person.bean.Person;
import com.itcv.person.condition.LinuxCondition;
import com.itcv.person.condition.WindowsCondition;

@Configuration //这是一个配置类
public class MainConfig2 {
	
	/**
	 * singleton  容器初始化的时候加载
	 * prototype  调用的时候加载 
	 * request  //web
	 * session  //web 
	 * 默认scope为singleton
	 * Lazy 懒加载 单例bean 容器初始化的时候不加载，调用的时候加载
	 * @return
	 */
	@Lazy(value=false)
	@Scope("singleton")
	@Bean
	public Person person() {
		System.out.println("初始化bean......");
		return new Person("张之洞",25);
	}
	
	/**
	 * 根据条件加载bean
	 */
	@Conditional(WindowsCondition.class)
	@Bean("bill")
	public Person person01() {
		return new Person("Bill Gates",63);
	}
	@Conditional(LinuxCondition.class)
	@Bean("linux")
	public Person person02() {
		return new Person("linus",48);
	}
	
	


}
