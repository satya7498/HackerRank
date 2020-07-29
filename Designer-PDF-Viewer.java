import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];
        String word = br.readLine();
        
        for(int i=0;i<str.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        int maxHeight =arr[0];
        
        for(int i=0;i<word.length();i++){
            int tmp = word.charAt(i);
            int heightOfChar = arr[tmp-97];
            
            if(maxHeight<heightOfChar){
                maxHeight=heightOfChar;
            }
        }
        
        System.out.println(maxHeight*word.length());
      
        

        
    }
}
