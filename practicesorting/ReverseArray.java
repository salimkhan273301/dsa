package practicesorting;
import java.lang.*;
import java.util.*;

public class ReverseArray {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] arr=new int[n];
	        for(int i=0; i<arr.length; i++)
	        {
	            arr[i]=sc.nextInt();
	        } 
	        int j=0;
	        for(int i=arr.length-1; i>=0; i-- )
	        {
	            arr[j++]=arr[i];
	        } 
	        for(int i=0; i<arr.length; i++)
	        {
	            System.out.println(arr[i]);
	        }      
	    }
	}


