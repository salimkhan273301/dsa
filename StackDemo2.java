import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;



 



public class StackDemo2 {
	   public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
		    // Write your code here
		    int maxHeight=0;
		    Stack<Integer> st1=new Stack<>();
		    Stack<Integer> st2=new Stack<>();
		    Stack<Integer> st3=new Stack<>();
		    //fillStack(st1,h1,st2,h2,st3,h3);
		    for(int i=h1.size()-1; i>=0; i--)
		    {
		        if(st1.isEmpty())
		        {
		            int a=h1.get(i);
		            System.out.println(a);
		            st1.push(a);
		        }
		        else {
		            int a=h1.get(i)+st1.peek();
		            System.out.println(a);
		            st1.push(a);
		        }
		    }
		     for(int i=h2.size()-1; i>=0; i--)
		    {
		        if(st2.isEmpty())
		        {
		            int b=h2.get(i);
		            st2.push(b);
		        }
		        else {
		            int b=h2.get(i)+st2.peek();
		            st2.push(b);
		        }
		    }
		     for(int i=h3.size()-1; i>=0; i--)
		    {
		        if(st3.isEmpty())
		        {
		            int c=h3.get(i);
		            st3.push(c);
		        }
		        else {
		            int c=h3.get(i)+st3.peek();
		            st3.push(c);
		        }
		    }
		    while(!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty() )
		    {
		        int st1Hight=st1.peek();
		        int st2Hieght=st2.peek();
		        int s3Height=st3.peek();
		        if(st1Hight==st2Hieght && st1Hight==s3Height)
		        {
		            maxHeight=st1.peek();
		            break;
		        }
		        if(st1Hight>st2Hieght || st1Hight>s3Height)
		        st1.pop();
		        else if(st2Hieght>st1Hight || st2Hieght>s3Height)
		        st2.pop();
		        else if(s3Height>st1Hight || s3Height>st2Hieght)
		        st3.pop();
		    }
		    return maxHeight;

		    }
		    



	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of h1");
	int n1=sc.nextInt();
	System.out.println("Enter the number in H1:");
		

	        List<Integer> h1 = new ArrayList<>();

	        for (int i = 0; i < n1; i++) {
	        	h1.add(sc.nextInt());
	           
	        }
	    	System.out.println("enter the size of h2");
	    	int n2=sc.nextInt();
	    	System.out.println("Enter the number in H2:");
	    		

	        List<Integer> h2 = new ArrayList<>();

	        for (int i = 0; i < n2; i++) {
	        	h2.add(sc.nextInt());
		           
	        }

	    	System.out.println("enter the size of h3");
	    	int n3=sc.nextInt();
	    	System.out.println("Enter the number in H3:");
	    		
	        List<Integer> h3 = new ArrayList<>();

	        for (int i = 0; i < n3; i++) {
	        	h3.add(sc.nextInt());
		           
	        }

	        int result = Result.equalStacks(h1, h2, h3);

	        System.out.println(result);
	      
	    }

	}


