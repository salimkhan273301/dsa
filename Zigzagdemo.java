import java.io.*;
import java.util.*;

public class Zigzagdemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter test case:");
       int t=sc.nextInt();
       for(int i=0; i<=t; i++)
       {
         int n=sc.nextInt();
        int[] arr=new int[n];
        for(int j=0; j<n; j++)
        {
          arr[j]=sc.nextInt();  
        }
        zigzag(arr, n);
       }
       
       }
     public static void zigzag(int[] arr, int n){           
        Arrays.sort(arr);
        int k=(n+1)/2;
        int i=arr.length-k;
        int j=arr.length-1;
        while(i<j)
        {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
            i++;
            j--;
            }
        
        for(int f=0; f<arr.length; f++)
        {
            System.out.print(arr[f]+" ");
        }
    
     }
    
}