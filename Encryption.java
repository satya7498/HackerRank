import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
       String str=s.replace(" ","");
       int len=str.length();
      double row=Math.floor(Math.sqrt(len));
      double col=Math.ceil(Math.sqrt(len));
      int i=(int)row;
      int j=(int)col;
      int mul=i*j;
       if(mul<len){
           if(i<j){
         i=i+1;
         mul=i*j;}
         else{
             j=j+1;
             mul=i*j;
         }
       }
       int diff=mul-len;
       for(int m=0;m<diff;m++)
       {
       str=str+" ";
       }

       int z=0;
String[][] arr = new String[i][j];
for(int a=0;a<i;a++)
{
    for(int b=0;b<j;b++)
    {
        arr[a][b]=String.valueOf(str.charAt(z++));
    
    }
}
String ans="";
for(int a=0;a<j;a++)
{
    for(int b=0;b<i;b++)
    {
        ans=ans+arr[b][a];
    
    }
    ans=ans+" ";
}
  ans=ans.replaceAll("( )+"," ");
  return ans;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
