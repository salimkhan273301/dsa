


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class GameOfThrone {

	    static String gameOfThrones(String s){
	        // Complete this function
	        int arr[] = new int[26];
	        for(char ch : s.toCharArray())
	        {
	            arr[ch-'a']++;
	        }
	        System.out.println(Arrays.toString(arr));
	        int counter = 0;
	        for(int i :arr)
	        {
	            if( i%2 == 1)
	            {
	                counter++;
	            }
	            if(counter >1)              
	                break;
	        }
	        if(counter <=1)
	        return "YES";
	        else
	        return "NO";
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Please Enter the String:");
	        String s = in.next();
	        String result = gameOfThrones(s);
	        System.out.println(result);
	    }
	}