package com.itcv.config;

import java.io.IOException;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyFilterType implements TypeFilter {

	public boolean match(MetadataReader metadataReader, MetadataReaderFactory readerFactory) throws IOException {
		System.out.println("执行了多少次");
		AnnotationMetadata metadata = metadataReader.getAnnotationMetadata(); //获取当前类的注解信息
		ClassMetadata classMeta = metadataReader.getClassMetadata();
		System.out.println("metadata"+metadata.getClassName()+" classMeta"+classMeta);
		if(metadata.getClassName().indexOf("person")>-1) {
			return false;
		}
		return true;
	}

}
