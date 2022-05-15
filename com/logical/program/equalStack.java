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

class Eql {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    // Write your code here
    
    int maxHight=0;
    Stack<Integer> s1=new Stack<>();
     Stack<Integer> s2=new Stack<>();
      Stack<Integer> s3=new Stack<>();
        fillstack(h1,s1,h2,s2,h3,s3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        while(!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty())
            {
         int s1hight=s1.peek();
         int s2hight=s2.peek();
         int s3hight=s3.peek();
         if(s1hight==s2hight && s2hight==s3hight)
         {
             
           maxHight=s1.peek();
           break;
          
        }
         
         if(s1hight>=s2hight && s1hight>=s3hight)
         {
             s1.pop();
         }
         else if(s2hight>=s1hight && s2hight>=s3hight)
         {
             s2.pop();
         }
        else if(s3hight>=s1hight && s3hight>=s2hight)
         {
             s3.pop();
         }
          
      }
        return maxHight;
    }
 public static void fillstack(List<Integer>h1,Stack<Integer> s1, List<Integer> h2,Stack<Integer> s2, List<Integer> h3,Stack<Integer> s3) 
    {
       int sum1=0; int sum2=0; int sum3=0; 
       for(int x: h1)
       {
           sum1+=x;
           s1.push(sum1);
       }
       for(int y: h2)
       {
           sum2+=y;
           s2.push(sum2);
       }
       for(int z: h3)
       {
           sum3+=z;
           s3.push(sum3);
       }
       
    }
}

public class equalStack {
    public static void main(String[] args) throws IOException {
      Scanner sc=new Scanner(System.in);
      System.out.println("Please Enter the hight of H1");
        int n1 = sc.nextInt();
        System.out.println("Please Enter the hight of H2");

        int n2 =sc.nextInt();
        System.out.println("Please Enter the hight of H3");

        int n3 =sc.nextInt();
        System.out.println("Please Enter the element in  ["+n1+"] H1");
        List<Integer> h1 = new ArrayList<>();
        		for(int i=0; i<n1; i++)
        		{
        			h1.add(sc.nextInt());
        		}
        		System.out.println("Please Enter the element in  ["+n2+"] H1");
        List<Integer> h2 = new ArrayList<>();
        		for(int i=0; i<n2; i++)
        		{
        			h2.add(sc.nextInt());
        		}
        		System.out.println("Please Enter the element in  ["+n3+"] H1");
        List<Integer> h3 = new ArrayList<>();
        		for(int i=0; i<n3; i++)
        		{
        			h3.add(sc.nextInt());
        		}

       

        int result = Eql.equalStacks(h1, h2, h3);

         System.out.println(String.valueOf(result));
        

       
    }
}

