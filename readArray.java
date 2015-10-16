package Proj;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		int[] m = new int[10];
		for(int i = 0 ; i < m.length; i++) {
			m[i] = scan.nextInt();
		}
		scan.close();
	}

}
