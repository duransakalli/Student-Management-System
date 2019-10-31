package java;

import java.util.Scanner;

public class JavaIfElse {

	static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x = scanner.nextInt();

        if (x % 2 == 1) {
            System.out.println("Weird");
        }

        if (x % 2 == 0 && x <= 5 && x >= 2){
            System.out.println("Not Weird");
        }

        if (x % 2 == 0 && x <= 20 && x >= 6) {
            System.out.println("Weird");
        }

        if (x % 2 == 0 && x > 20){
            System.out.println("Not Weird");
        }
    }
}
