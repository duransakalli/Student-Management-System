package java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        int n2 = sc.nextInt();
        
        for(int i = 0; i < n2; i++) {
            String input = sc.next();
            if(input.equals("Insert")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                list.add(a, b);
            } 
            else {
                int c = sc.nextInt();
                list.remove(c);
            }     
            
        }
        sc.close();
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        
        
    }
}
