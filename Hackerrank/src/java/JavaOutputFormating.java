package java;

import java.util.Scanner;

public class JavaOutputFormating {
	private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        scanner.nextLine();
        String z = scanner.nextLine();
        

        System.out.println("String: "+z);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);

    }
}
