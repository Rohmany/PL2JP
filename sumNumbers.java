package Proj;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in); // Create Scanner Object
		int a = scan.nextInt(); // Assign value scanned by the scanner to integer a
		int b = scan.nextInt(); // Assign value scanned by the scanner to integer b
		int c = a + b; // Assign a+b to c
		System.out.println(c);  // print c
		scan.close(); // Close Scanner
	}

}
