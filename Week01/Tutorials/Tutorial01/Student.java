public class Student{
//Start with private fields
	private String name;
	private String studentId;
	private double cgpa;

//Initialize Student Object
		public Student(String name,String studentId,double cgpa){
			this.name = name;
			this.studentId = studentId;
			this.cgpa = cgpa;
		}

//Read from private file
		public String getName(){
			return name;
		}
		public String studentId(){
			return studentId;
		}
		public double cgpa(){
			return cgpa;
		}

		public static void main(String[] args){

			Student student1 = new Student("Ethan Lim" , "26073770/1", 3.85);

			System.out.println("Student Details:");
      System.out.println("Name: " + student1.getName());
      System.out.println("ID:   " + student1.getStudentId());
      System.out.println("CGPA: " + student1.getCgpa());
		}

}
