package com.logical.program;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class RemoveDublicateAndPrintLexicalOrder {
	private static String isValid(String s) {
		 int[] lastIndex = new int[26];
         for (int i = 0; i < s.length(); i++)
             lastIndex[s.charAt(i) - 'a'] = i;// track the lastIndex of character presence
         System.out.println(Arrays.toString(lastIndex));
         
         boolean[] seen = new boolean[26]; // keep track seen
         Stack<Integer> st = new Stack<>();
         for (int i = 0; i < s.length(); i++) {
        	 System.out.println(s.charAt(i) - 'a');
             int c = s.charAt(i) - 'a';
             if (seen[c]) continue; // if seen continue as we need to pick one char only
             while (!st.isEmpty() && st.peek() > c && i < lastIndex[st.peek()])
                 seen[st.pop()] = false; // pop out and mark unseen
             st.push(c); // add into stack
             seen[c] = true; // mark seen
             System.out.println(Arrays.toString(seen));
         }
         System.out.println(st.toString());

         StringBuilder sb = new StringBuilder();
         while (!st.isEmpty())
             sb.append((char) (st.pop() + 'a'));
         return sb.reverse().toString();
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
       
        String s =sc.nextLine();

        String result =isValid(s);

      System.out.println(result);

	}

	

}
