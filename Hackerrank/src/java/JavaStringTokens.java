package java;

import java.util.*;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] a = in.nextLine().trim().split("[ !,?\\._'@]+", 0);
		if (a.length == 1 && a[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(a.length);
			for (String s : a)
				System.out.println(s);
		}
		in.close();
	}
}
