package Proj;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter +, -, * or / then your two numbers");
		char ch = scan.next().charAt(0);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
		switch(ch) {
		case '+':
			c = a + b;
			break;
		case '-':
			c = a - b;
			break;
		case '*':
			c = a * b;
			break;
		case '/':
			if(b == 0) c = Integer.MAX_VALUE;
			else c = a / b;
			break;
		default:
			System.out.println("Invalid Selection");
		}
		System.out.println("The Answer is " + c);
		scan.close(); // Close Scanner
	}

}
