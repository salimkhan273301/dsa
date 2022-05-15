package com.logical.program;
import java.util.*;


public class Frequencycount {
	
	

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("please Inter the Size");
	        int n = scan.nextInt();
	        HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();
	        
	        while(n-- > 0) {
	        	System.out.println("please Enter the [" + n +"] element:");
	            int c = scan.nextInt();
	            Integer frequency = colors.get(c);
	            System.out.println(frequency);
	            
	            // If new color, add to map
	            if(frequency == null) {
	                colors.put(c, 1);
	            }
	            else { // Increment frequency of existing color
	                colors.put(c, frequency + 1);
	            }
	        }
	        scan.close();
	        
	        // Count and print the number of pairs
	        int pairs = 0;
	        for(Integer frequency : colors.values()) {
	            pairs += frequency >> 1;
	        }
	        System.out.println(pairs);
	    }
	}


