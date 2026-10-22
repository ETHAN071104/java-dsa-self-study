import java.util.ArrayList;
import java.util.List;

public class TaskFirstExample {
    private static class Student {
        private final String name;
        private final String studentId;

        Student(String name, String studentId) {
            this.name = name;
            this.studentId = studentId;
        }

        @Override
        public String toString() {
            return name + " (" + studentId + ")";
        }
    }

    public static void main(String[] args) {
        List<Student> roster = new ArrayList<>();
        roster.add(new Student("Ari", "A12"));
        roster.add(new Student("Mina", "B07"));
        roster.add(new Student("Ari", "A12"));

        for (Student student : roster) {
            System.out.println(student);
        }
        System.out.println("At index 1: " + roster.get(1));
    }
}
