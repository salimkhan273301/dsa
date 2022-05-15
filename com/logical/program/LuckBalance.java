package com.logical.program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class LuckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Contests:");
		int noOfContest=sc.nextInt();
		System.out.println("Enter the K value:");
		int k=sc.nextInt();
		int maxLuck=0;
		ArrayList<Integer> impContest=new ArrayList<>();
		for(int i=0; i<noOfContest; i++)
		{	System.out.println("Enter the Luck value:");
			int luck=sc.nextInt();
			System.out.println("Enter the Important Contest:");
			int important=sc.nextInt();
			if(important!=1)
			{
				maxLuck+=luck;
				
			}
			
			else
			{
				
					impContest.add(luck);
				
			}
			
		}
			Collections.sort(impContest,Collections.reverseOrder());         //in important contest the luck have  more valued will be upper and less lower which is not important;
			System.out.println(impContest.toString());
			for(int j = 0; j < impContest.size(); j++)
			{
				if(j<k)
				{
					maxLuck+=impContest.get(j);
				}
				else
				{
					maxLuck-=impContest.get(j);
				}
			}
		
				System.out.println(maxLuck);
	}

}
