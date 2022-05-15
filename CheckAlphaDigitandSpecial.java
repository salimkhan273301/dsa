import java.util.Scanner;

public class CheckAlphaDigitandSpecial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int alpha=0, dig=0, spl=0;
		System.out.println("Please Enter a mixString:");
		String s=sc.next();
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
			{
				alpha++;
			}
			else if(ch>='0' && ch<='9')
			{
				dig++;
			}
			else
			{
				spl++;
			}
		}
		System.out.println("Alphabet:"+alpha);
		System.out.println("Digit:"+dig);
		System.out.println("Special Character:"+spl);

	}

}
