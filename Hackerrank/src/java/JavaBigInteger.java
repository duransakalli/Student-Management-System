package java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		BigInteger sum = n.add(m);
		BigInteger x = n.multiply(m);

		System.out.println(sum + "\n" + x);
		
		sc.close();
	}
}
