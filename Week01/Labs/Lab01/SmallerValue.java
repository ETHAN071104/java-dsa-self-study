
import java.util.Scanner;

public class SmallerValue {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter two integers for comparison");

        System.out.print("Enter first integer: ");
        int num1 = keyboard.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = keyboard.nextInt();

        int min = 0;

        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        System.out.println("The smallest number is: " + min);

        if (min % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        keyboard.close();
    }
}
