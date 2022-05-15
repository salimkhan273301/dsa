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


public class StringisValid {
    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
    Map<Character,Integer> freq=new HashMap<>();
    for(int i=0; i<s.length(); i++){
    char c=s.charAt(i);
    int f=freq.getOrDefault(c,0);//if c is  not persent it will give 0 else c frequency wich is in map...2g 
    System.out.println(f);
    freq.put(c, ++f);}
    System.out.println(freq.toString());
    int[] arr=new int[freq.size()];
    int i=0;
    for(Map.Entry<Character,Integer> x:freq.entrySet())
    {
        arr[i++]=x.getValue();
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    if(freq.size()==1) return "YES";
    int first=arr[0];
    int second=arr[1];
    int secondLast=arr[freq.size()-2];
    int last=arr[freq.size()-1];
    if(first==last) return "YES";
    if(first==1 && second==last) return "YES";
    if(first==second && second==secondLast && secondLast==last-1) return "YES";
    else
    return "NO";
    
    }




    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       
        String s =sc.nextLine();

        String result =isValid(s);

      System.out.println(result);
       
    }
}

