import java.util.*;

	public class InfyTQ
	{ 
	  public static void main(String args[])
	  {
	    Scanner sc = new Scanner (System.in);
	    int max=Integer.MIN_VALUE;
	    int index=0;
	    System.out.println("Enter the size of Array:");
	    int n=sc.nextInt();
	    int v[]= new int[n];
	    for(int i=0; i<n; i++)
	    {
	    	v[i]=sc.nextInt();
	    }
	    System.out.println(Arrays.toString(v) );
	    int x=sc.nextInt();
	   
	    for(int i=0; i<v.length; i++){
	            if(max<v[i])
	            {
	            	max=v[i];
	            	 index=i;
	            	
	            }
	            
	            
	        }
	    
	    System.out.println(index+1);
	    }
	    
	    
	  }
	 
