package com.itcv.person.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		/**
		 * 获取类加载器 
		 */
	  	ClassLoader classLoader = context.getClassLoader();
		/**
		 * 获取环境变量
		 */
		Environment environment =  context.getEnvironment();
		String osName = environment.getProperty("os.name");
		if(osName.contains("linux")) {
			return true;
		}
		context.getRegistry();
		return false;
	}

}
