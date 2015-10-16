package Proj;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int f = 1;
		boolean going = true;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < (size-f)/2; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < f; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < (size-f)/2; j++) {
				System.out.print(" ");
			}
			System.out.println();
			if (f == size) going = false;
			if (going) f += 2;
			else f -= 2;
		}
		scan.close();
	}

}
