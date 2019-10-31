package java;

import java.util.Scanner;

public class JavaDatatypes {
	public static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++){

            try {


                long l = scanner.nextLong();
                System.out.println(l + " can be fitted in:");

                if (l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE) {
                    System.out.println("* byte \n* short \n* int \n* long");
                } else if (l <= Short.MAX_VALUE && l >= Short.MIN_VALUE) {
                    System.out.println("* short \n* int \n* long");
                } else if (l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE) {
                    System.out.println("* int \n* long");
                } else if (l <= Long.MAX_VALUE && l >= Long.MIN_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e){
                System.out.println(scanner.next() +" can't be fitted anywhere.");
            }


        }

scanner.close();


    }
}
