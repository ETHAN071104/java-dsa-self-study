public class Student {
    private String name;
    private String studentId;
    private double cgpa;

    public Student(String name, String studentId, double cgpa){
        this.name = name;
        this.studentId = studentId;
        validCgpa(cgpa);
    }

    public String getName() {
        return name;
    }

    public String getStudentId(){
        return studentId;
    }

    public double getCgpa(){
        return cgpa;
    }

    public boolean validCgpa(double cgpa){
        if (cgpa >= 0.0 && cgpa <= 4.0){
            this.cgpa = cgpa;
            return true;
        } else {
            System.out.println("Error: Invalid CGPA");
            return false;
        }
    }

    public void printDetials(){
        // Added spaces between fields and added \n at the end
        System.out.printf("Student Name: %s | Student ID: %s | CGPA: %.2f\n", name, studentId, cgpa);
    }
    
    public static void main(String[] args){
        Student s1 = new Student("Joney", "101", 4.0);

        System.out.println("Student Details");
        s1.printDetials();
    }
}