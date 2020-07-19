import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int n= c.length;
      
         int i=0;int count=0;
         if(n==2)
          {
              return 1;
          }
          else{
        while(i<n-2){
            if(c[i+1]==0 && c[i+2]==0)
             {
                 count++;
                 i=i+2;
             }
             else if(c[i+1]==1 && c[i+2]==0)
             {
                 count++;
                 i=i+2;
             }
             else{
                 count++;
                 i=i+1;
             }
   
    }
     if(c[n-3]==1)
      return count+1;
     
      else 
      return count; }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
