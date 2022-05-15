package com.logical.program;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class LeftRotationdemo{   

    public static void rotLeft(int[] a, int k) {
    // Write your code here
    	 System.out.println(Arrays.toString(a));
    int j=0;
    k%=a.length;
    int[] temp=new int[k];
    for(int i=0; i<k; i++)
    {
        temp[i]=a[i];
    }
    for(int i=0; i<a.length-k; i++)
    {
        a[i]=a[i+k];
    
    }
    for(int i=a.length-k; i<a.length; i++)
    {
        a[i]=temp[j++];
    }
    
    
         System.out.println(Arrays.toString(a));
    
    }



    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       
System.out.println("Enter the the Array Size:");
        int n = sc.nextInt();
System.out.println("Enter the term of rotation");
        int d = sc.nextInt();
        System.out.println("enter ["+n+"] element");
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
                 
    }
        rotLeft(arr, d);
    }}
