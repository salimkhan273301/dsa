package sorting.revature.com;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'insertionSort' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int insertionSort(int[] arr) {
    
    // Write your code here
    
    
    int count=0;
    for(int i=1; i<arr.length; i++)
   {
        
    
        int temp=0;
        int j=i-1;
            
    
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
            count++;
            
        }
    
        arr[j+1]=temp;
    }
        return count;
    }

}

public class NewSorting {
    public static void main(String[] args) throws IOException {
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      for(int j=0; j<r; j++){
          
      
      
      int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
               arr[i]=sc.nextInt();
            }

            int result = Result.insertionSort(arr);

            System.out.println(String.valueOf(result));
            
        }

    }  
    }


