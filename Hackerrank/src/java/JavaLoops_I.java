package java;

import java.util.Scanner;

public class JavaLoops_I {
	static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(x + " x " + (i + 1) + " = " + (x*(i+1)));
        }
    }
}
