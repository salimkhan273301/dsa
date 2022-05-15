package com.logical.program;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
    // Write your code here
    StringBuilder sb=new StringBuilder(s);
   Boolean pn=true;
   while(pn)
   {
       pn=false;
       for(int i=0; i<sb.length()-1; ++i)
    {
        if(sb.charAt(i)==sb.charAt(i+1))
        {
            sb.delete(i, i+2);
            pn=true;
        }
    }
   }
    if (sb.length() == 0) {
            return "Empty String";
        } else {
            return sb.toString();
        }
    

    }

}

public class StringInportantQ {
    public static void main(String[] args) throws IOException {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the String:");
        String s =sc.nextLine();

        String result = Result.superReducedString(s);

        System.out.print(result);
        
       
    }
}

