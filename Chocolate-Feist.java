import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
     int bars=n/c;
     int wrapper=bars;

     while(wrapper!=0)
     {
         if(wrapper<m)
           return bars;
         else
         {
             int cum=0;
              while(wrapper-m>=0)
              {
                  cum++;
                  wrapper=wrapper-m;
              }
              bars=bars+cum;
              wrapper=wrapper+cum;
         }  
     }
    
   return bars;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
