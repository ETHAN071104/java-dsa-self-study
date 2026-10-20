import java.util.Scanner;

public class Student{
	private String name;
	private String studentId;
	private double cgpa;

	public Student(String name,String studentId,double cgpa){
		this.name = name;
		this.studentId = studentId;
		this.cgpa = cgpa;
	}

public void Updatecgpa(double newCgpa){
		setOrUpdateCgpa(newCgpa);
	}

public void printDetials(){
	System.out.println("ID :" + studentId + " | Name :" + name + " | CGPA" + cgpa);
}

public static void main(String[] args){
	Student s1 = new Student("Alice" , "101" , 3.8);
	Student s2 = new Student("Bob" , "102" , 3.5);
	Student s3 = new Student("Chloe" , "103" , 3.0);

		System.out.print("\n---- Student Detials --- ");

	}
}
