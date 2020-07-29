import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the equalizeArray function below.
    public static void main(String []args) 
{ 
    Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
   for(int a=0;a<n;a++)
   {
       arr[a]=sc.nextInt();
   }
   
     boolean visited[] = new boolean[n]; 
      
    Arrays.fill(visited, false); 
  List<Integer> l = new ArrayList<>(); 
    // Traverse through array elements and 
    // count frequencies 
    for (int i = 0; i < n; i++) { 
  
        // Skip this element if already processed 
        if (visited[i] == true) 
            continue; 
  
        // Count frequency 
        int count = 1; 
        for (int j = i + 1; j < n; j++) { 
            if (arr[i] == arr[j]) { 
                visited[j] = true; 
                count++; 
            } }

  l.add(count);
        } 
        Collections.sort(l);
    int sum=0;
        for(int z=0;z<l.size()-1;z++)
        {
            sum+=l.get(z);
        }
       
 
   System.out.println(sum);

    
    
        
    }
}
