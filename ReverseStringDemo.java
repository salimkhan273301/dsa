import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the String");
		String s=sc.next();
		System.out.println(reversedemo(s));
		

	}

	private static String reversedemo(String s) {
		if(s.isEmpty())
		return s;
		else
			System.out.println(s.substring(1)+" "+s.charAt(0));
			return  reversedemo(s.substring(1))+s.charAt(0);
	}

}
