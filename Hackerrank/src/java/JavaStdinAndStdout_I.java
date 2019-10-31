package java;

import java.util.Scanner;

public class JavaStdinAndStdout_I {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int x = scanner.nextInt();

        int y = scanner.nextInt();

        int z = scanner.nextInt();

        System.out.printf("%d\n%d\n%d%n", x, y, z);

    }
}
