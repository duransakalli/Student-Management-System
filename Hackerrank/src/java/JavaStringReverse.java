package java;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String A = scanner.nextLine();

		String B = "";

		for (int i = A.length() - 1; i >= 0; i--) {
			B += A.charAt(i);
		}

		if (A.equals(B)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scanner.close();
	}

}
