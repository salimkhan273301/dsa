import java.util.Scanner;

public class ReverseusingBuilderandBuffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please Enter the String:");
		String s=sc.nextLine();
		//StringBuilder sb=new StringBuilder(s);
		StringBuffer sb=new StringBuffer(s);
		String s1=sb.reverse().toString();
		//if(s1.equals(s))						// check it your self...
		if(s1.equalsIgnoreCase(s))
		{
			System.out.println("Palindrom");
		}
		else
			
		{
			System.out.println("Not palindrom");
		}

	}

}
