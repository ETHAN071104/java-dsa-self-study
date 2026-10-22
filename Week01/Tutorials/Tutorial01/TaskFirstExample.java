public class TaskFirstExample {
    private static class Student {
        private final String name;
        private final String studentId;
        private double cgpa;

        Student(String name, String studentId, double cgpa) {
            this.name = name;
            this.studentId = studentId;
            this.cgpa = cgpa;
        }

        void updateCgpa(double newCgpa) {
            if (Double.isNaN(newCgpa) || newCgpa < 0.0 || newCgpa > 4.0) {
                throw new IllegalArgumentException("CGPA must be between 0.0 and 4.0");
            }
            cgpa = newCgpa;
        }

        void printSummary() {
            System.out.println(name + " (" + studentId + "): " + cgpa);
        }
    }

    public static void main(String[] args) {
        Student first = new Student("Ari", "S1001", 3.2);
        Student second = new Student("Mina", "S1002", 3.7);
        first.updateCgpa(3.4);
        first.printSummary();
        second.printSummary();
    }
}
