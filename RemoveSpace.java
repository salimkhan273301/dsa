import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please Inter the String:");
		String s=sc.nextLine();
		for(int i=0; i<s.length(); i++ )
		{
			
		
		
		System.out.print(s.charAt(i));
		
		
			
		}
		System.out.println("\nLength of String is="+s.length());
		String a=s.replaceAll("\\s", "");
		
System.out.println("removed all space");
System.out.println(a);
	}

}
