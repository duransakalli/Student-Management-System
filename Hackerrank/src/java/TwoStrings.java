package java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoStrings {
	// Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	String yes = "NO";
    	for(int i = 0; i < s1.length(); i++)
    	{
    		for(int j = i; j < s2.length(); j++)
    		{
    			if(s1.charAt(i) == s2.charAt(j)) {
    				yes = "YES";
    			}
    		}
    	}
    	return yes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
