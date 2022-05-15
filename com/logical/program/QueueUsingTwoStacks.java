package com.logical.program;


	
	import java.util.Stack;
	import java.*;
	import java.util.Scanner;


	public class QueueUsingTwoStacks {
	  private static Stack<Integer> input = new Stack();
	  private  static Stack<Integer> output = new Stack();

	  public static void enqueue(int x) {
	    input.push(x);
	  }

	  public static int dequeue() {
	    peek();
	    return output.pop();
	  }

	  public static int peek() {
	    if (output.empty())
	      while (!input.empty())
	        output.push(input.pop());
	    return output.peek();
	  }

	 // public boolean isEmpty() {
	   // return input.empty() && output.empty();
	  ///}

	public static  void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0; i<n; i++)
	{
	    int x=sc.nextInt();
	    if(x==1)
	    {
	        enqueue(sc.nextInt());
	    }
	    else if(x==2)
	    {
	        dequeue();
	    }
	    else
	    {
	        System.out.println(peek());
	    }
	}



	 
	}}


