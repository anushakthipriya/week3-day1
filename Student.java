package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println(" Student NAme : Anu");
	}
	public void studentDpt()
	{
		System.out.println("Department : CSE");
	}
	public void studentId()
	{
		System.out.println("Student Id : 13mcs0098");
	}

	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.collegeName();
		stud1.collegeCode();
		stud1.collegeRank();
		stud1.deptName();
		stud1.studentName();
		stud1.studentDpt();
		stud1.studentId();
		

	}

}
