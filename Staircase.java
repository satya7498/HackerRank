import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();

    
     int i,j,k;
     for(i=1;i<=n;i++)
     {
         for(j=1;j<=n-i;j++)

         {
             System.out.print(" ");

             }
         for( k=n-i+1;k<=n;k++)

         {
             System.out.print("#");

             }
             
            System.out.println();
     }

    }

   
       
}
