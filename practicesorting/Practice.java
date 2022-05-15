package practicesorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {
	private static void divisibleSumPairs(int n, int k, List<Integer> ar) {
		int count=0;
	    for(int i=0; i<n-1; i++)
	    {
	        for (int j=i+1; j<n; j++)
	        {
	            if((ar.get(i)+ar.get(j))%k==0)
	            count++;
	        }
	    }
	    System.out.println(count);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		List<Integer> ar=new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			ar.add(sc.nextInt());
		}
		divisibleSumPairs(n, k, ar);
	
	}



}
