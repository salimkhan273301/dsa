import java.util.Arrays;
import java.util.Scanner;

public class DivisibleTopQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Size of Array:");
	        int N = 0;
	        N = sc.nextInt();
	       System.out.println("Enter data:"); 
	        int[] data = new int[N];
	        for(int i=0; i<N; i++){
	            data[i] = sc.nextInt();
	        }
	       System.out.println(Arrays.toString(data));
	       division(data);
	    
	}

	private static void division(int[] data) {
		// TODO Auto-generated method stub
		 String s="";
	       
	        for(int i=0; i<data.length; i++)
	        {
	            String x=String.valueOf(data[i]);
	            System.out.println(x);
	            x=String.valueOf(x.charAt(x.length()-1));
	            System.out.println(x);
	            s=s+x;
	            System.out.println(s);
	        }
	        int n=Integer.valueOf(s);
	        if(n%5==0)
	            System.out.println("Yes");
	            
	        else
	           System.out.println("No");

		
	}

}
