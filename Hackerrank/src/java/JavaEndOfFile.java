package java;

import java.util.Scanner;

public class JavaEndOfFile {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int i = 1;

		while (scanner.hasNext()) {
			String n = scanner.nextLine();
			System.out.println(i + " " + n);
			i++;
		}

	}

}
