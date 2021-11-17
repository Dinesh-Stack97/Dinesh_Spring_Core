package com.Spring.Annotation_based_config_class.Spring_config_class_exclude_xml;

import org.springframework.stereotype.Component;
/*To configure the bean inside the classs and not in the xml file we use 
 * @Component where it is used to create bean object
 * 
 */
//@Component("collegeBean")
public class College {
	
	private Principal principle	;
	private Student student;
	private Teacher teacher;
	
	 





	




	public void setStudent(Student student) {
		this.student = student;
	}





	public void setPrinciple(Principal principle) {
		this.principle = principle;
	}





	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}





	public College(Principal principle) {
		
		this.principle = principle;
	}
	
	
	
	





	public void Test()
	{
		principle.principalInfo();
		System.out.println("Pricipal....");
		student.StudentInfo();
		teacher.Teach();
	}

}
