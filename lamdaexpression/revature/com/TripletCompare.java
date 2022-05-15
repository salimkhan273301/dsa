package lamdaexpression.revature.com;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class TripletCompare {
    public static void main(String[] args) throws IOException {
 Scanner sc=new Scanner(System.in);
 int[] a=new int[3];
 int[] b=new int[3];
 for(int i=0; i<3; i++)
 {
     a[i]=sc.nextInt();
 }
 for(int j=0; j<3; j++)
 {
     b[j]=sc.nextInt();
 }
 int[] r=new int[2];
 r[0]=0;
 r[1]=0;
 for(int k=0; k<3; k++)
 {
     if(a[k]>b[k])
     {
         r[0]=r[0]+1;
     }
     else if(a[k]<b[k])
     {
         r[1]=r[1]+1;
     }
      else
     {
         r[0]=r[0]+0;
         r[1]=r[1]+0;
     }
 }
 for(int i=0; i<r.length; i++)
 {
     System.out.print(r[i]+" ");
 }
    }
}