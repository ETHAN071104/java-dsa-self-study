import java.util.ArrayList;
import java.util.List;

// 1. Interface for bonus-eligible staff
interface BonusEligible {
    double calculateBonus();
}

// 2. Base abstract class
abstract class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}

// 3. FullTimeEmployee implementing BonusEligible
class FullTimeEmployee extends Employee implements BonusEligible {
    private double monthlySalary;
    private double bonusRate;

    public FullTimeEmployee(String id, String name, double monthlySalary, double bonusRate) {
        super(id, name);
        this.monthlySalary = monthlySalary;
        this.bonusRate = bonusRate;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    @Override
    public double calculateBonus() {
        return monthlySalary * bonusRate; // Fixed typo
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + calculateBonus();
    }
}

// 4. PartTimeEmployee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String id, String name, double hourlyRate, double hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// 5. Main Execution
public class SalarySystem {
    public static void processPayroll(List<Employee> employees) {
        double totalPayout = 0.0;

        System.out.println("=========== COMPANY PAYROLL ===========");
        for (Employee emp : employees) {
            // Polymorphic call: the JVM automatically decides which calculateSalary() runs!
            double salary = emp.calculateSalary();
            totalPayout += salary;

            System.out.println("ID: " + emp.getId() + " | Name: " + emp.getName() + " | Salary: $" + salary);
        }

        System.out.println("---------------------------------------");
        System.out.println("Total Payout: $" + totalPayout);
        System.out.println("=======================================");
    }
    public static void main(String[] args) {
        // Pass 4 arguments now: id, name, base salary, bonus rate
        FullTimeEmployee ft = new FullTimeEmployee("FT-101", "Alice", 5000.00, 0.10);
        PartTimeEmployee pt = new PartTimeEmployee("PT-201", "Bob", 25.00, 80);

        System.out.println(ft.getName() + " Bonus: $" + ft.calculateBonus());
        System.out.println(ft.getName() + " Total Salary: $" + ft.calculateSalary());
        System.out.println(pt.getName() + " Total Salary: $" + pt.calculateSalary());
    }
}