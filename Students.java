package week3.day1;

public class Students
{
	public void getStudentInfo(double a)
	{
		System.out.println("student id is: " + a);
	}
	public void getStudentInfo(float a, String b)
	{
		System.out.println("student id " + a + "  and  " + "student name is: " + b);
	}
	public void getStudentInfo(String a, int b)
	{
		System.out.println("student mail: " + a + "  and  " + "student num is: " + b);
	}

	public static void main(String[] args)
	{
		Students stud = new Students();
		stud.getStudentInfo(001);
		stud.getStudentInfo(1.0f, "ANU");
		stud.getStudentInfo("asp@gmail.com", 890345678);
	
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

