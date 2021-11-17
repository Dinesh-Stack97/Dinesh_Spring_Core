package Spring_Dependancy_Injection.com.Spring.DI;

public class Student {
	//To set this dependancy or how to inject value to this dependancy
	private String StudentName;//Encapsulation Technique:->Available only inside class
	
	
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}


	public void displayStudentInfo()
	{
		System.out.println("Student Name is : "+StudentName);
	}

}
