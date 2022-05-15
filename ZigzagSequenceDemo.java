import java.io.*;
import java.util.*;

public class ZigzagSequenceDemo {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter  the Size:");		
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
          arr[i]=sc.nextInt();  
        }
        		
        Arrays.sort(arr);
        int k=(n+1)/2;
        int i=arr.length-k;
        int j=arr.length-1;
        while(i<j)
        {
        	int temp=arr[i];
        	arr[i]=arr[j];
        	arr[j]=temp;
        	i++;
        	j--;
        	}
        System.out.println(Arrays.toString(arr));
        	
        sc.close();
    }
}
