import java.util.Scanner;

public class SimpleCalculator{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter first interger number: ");
	int num1 = keyboard.nextInt();
	
	System.out.print("Enter second interger number: ");
	int num2 = keyboard.nextInt();
	
	System.out.print("Enter the operand (+, -, *, /) : ");
	char logic = keyboard.next().charAt(0);
	
	int result = 0;
	
	if (logic == '+')
		result = num1 + num2;
		
	if (logic == '-')
		result = num1 + num2;
		
	if (logic == '*')
		result = num1 + num2;
		
	if (logic == '/')
		result = num1 + num2;
		
	if (logic == '+')
		result = num1 + num2;
		
		System.out.print("The result of " + num1 +" " + logic + " " + num2 + " is " + result);
		
	keyboard.close();
	}
}