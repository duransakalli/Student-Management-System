package java;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);        
	        //System.out.println("Enter number of input");        
	        int n = sc.nextInt();
	        ArrayList[] size = new ArrayList[n];
	        
	        for(int i = 0; i < n; i++) {
	            
	            int arrSize = sc.nextInt();
	            size[i] = new ArrayList();
	            for(int j = 0; j < arrSize; j++) {
	                size[i].add(sc.nextInt());                
	            }
	        }
	        
	        int x = sc.nextInt();
	        for(int i = 0; i < x; i++) {
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            
	            try {
	                System.out.println(size[a-1].get(b-1));
	            } catch (Exception e) {
	                System.out.println("ERROR!");
	            }
	            
	        }
	        
	    }
}
