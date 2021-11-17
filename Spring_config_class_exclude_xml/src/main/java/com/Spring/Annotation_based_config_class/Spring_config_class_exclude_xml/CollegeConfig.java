package com.Spring.Annotation_based_config_class.Spring_config_class_exclude_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.Spring.Annotation_based_config_class.Spring_config_class_exclude_xml")
public class CollegeConfig {
	
	
	public Teacher javaTrainerBean()
	{
		return new Java_Trainer();
	}
	@Bean
	public Principal principalBean()
	{
		return new Principal(); 
	}
	
	public Student studentBean()
	{
		return new Student();
	}
    
	@Bean(name= {"colbean","collegeBean"})
	public College collegeBean()//-->bean id
	{
		//return new College(principalBean());
		/*using setter to inject values
		 * College college = new College();
		 * college.SetStudent(studentBean());
		 * return college;
		 */
		College college = new College(principalBean());
		
		college.setTeacher(javaTrainerBean());
		college.setStudent(studentBean());
		return college;
		
	}
	
	
}
