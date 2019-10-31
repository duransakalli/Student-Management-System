package java;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String A = scanner.nextLine();
		String B = scanner.nextLine();

		System.out.println(A.length() + B.length());

		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase() + " "
				+ B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase());
		
		scanner.close();
	}
}
