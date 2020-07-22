import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int i;
        float p=(float) 0.0;
        float s=(float) 0.0;
        float z=(float) 0.0;
        float p1,n1,z1;
        int len=arr.length;
        for(i=0;i<arr.length;i++)
         {
             if(arr[i]>0)
               p++;
               else if(arr[i]<0)
                s++;
                else
                 z++;
         }
         p1=p/len;
         n1=s/len;
         z1=z/len;
         System.out.println(p1);
         System.out.println(n1);
         System.out.println(z1);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
