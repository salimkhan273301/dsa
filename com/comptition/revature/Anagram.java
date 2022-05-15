package com.comptition.revature;
import java.io.*;
import java.util.*;

public class Anagram {

   static boolean isAnagram(String A, String B) {
       if(A == null || B == null) {
           if(A != null || B != null) {
               return false;
           }
           return true;
       }
       A = A.toLowerCase();
       B = B.toLowerCase();
       char[] aArr = A.toCharArray();
       char[] bArr = B.toCharArray();
       System.out.println(Arrays.toString(aArr));
       System.out.println(Arrays.toString(bArr));
       Arrays.sort(aArr);
       Arrays.sort(bArr);
       System.out.println(Arrays.toString(aArr));
       System.out.println(Arrays.toString(bArr));
       String aSorted = new String(aArr);
       String bSorted = new String(bArr);
       System.out.println(aSorted);
       System.out.println(bSorted);
       
       return aSorted.equals(bSorted); 
       
       
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter s1:");
        String A=sc.next();
        System.out.println("Enter s2:");
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
