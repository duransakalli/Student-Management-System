package java;

import java.util.Scanner;

public class Java1DArray {
	  public static void main(String[] args) {
		   
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

	        scan.close();

	        int[] a = new int[n];


	        for(int i = 0; i < n; i++ ){
	            a[i] = scan.nextInt();
	        }
	        
	        for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }
	    }
}
