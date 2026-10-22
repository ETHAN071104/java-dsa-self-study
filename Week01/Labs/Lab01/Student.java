import java.util.Scanner;

public class Student {
    private String name;
    private String studentId;
    private double cgpa;

    // Constructor
    public Student(String name, String studentId, double cgpa) {
        this.name = name;
        this.studentId = studentId;
        this.cgpa = cgpa;
    }

    // Method to update CGPA
    public void updateCgpa(double newCgpa) {
        if (newCgpa >= 0.0 && newCgpa <= 4.0) {
            this.cgpa = newCgpa;
        } else {
            System.out.println("Invalid CGPA value. Must be between 0.0 and 4.0.");
        }
    }

    // Display student details
    public void printDetails() {
        System.out.printf("ID: %-5s | Name: %-10s | CGPA: %.2f%n", studentId, name, cgpa);
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student("Alice", "101", 3.8);
        Student s2 = new Student("Bob", "102", 3.5);
        Student s3 = new Student("Chloe", "103", 3.0);

        System.out.println("\n---- Student Details ----");
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

        // Updating Chloe's CGPA using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter new CGPA for Chloe (ID: 103): ");
        if (scanner.hasNextDouble()) {
            double updatedScore = scanner.nextDouble();
            s3.updateCgpa(updatedScore);

            System.out.println("\n---- Updated Student Details ----");
            s3.printDetails();
        } else {
            System.out.println("Invalid input format.");
        }

        scanner.close();
    }
}