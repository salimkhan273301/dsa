import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Haker1 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        int x = scan.nextInt();

	      List <Integer> myList = new ArrayList<Integer>(x);
	        for (int i =0; i< x; i++)
	        {
	            myList.add(scan.nextInt());

	        }
	        int numQ= scan.nextInt();

	        for (int i=0; i<numQ; i++)
	        {
	            if (scan.next().equalsIgnoreCase("insert")){

	                int pos = scan.nextInt();
	                int num = scan.nextInt();

	                myList.add(pos,num);
	            }
	            else {

	                myList.remove(scan.nextInt());
	            }


	        }

	        for (Integer i : myList)
	                   System.out.print(i+" ");


	    
	    }
	

	
	}


