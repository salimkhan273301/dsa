import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InfyTQdeo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the String:");
		String s=sc.nextLine();
		System.out.println(getuniqueLetter(s));
		

	}

	private static int getuniqueLetter(String s) {
		Map<Character,Integer> map=new HashMap<>();
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i], map.get(ch[i])+1);
			}
			else
			{
				map.put(ch[i], 1);
			}
		}
		System.out.println(map.toString());
		char u=s.charAt(0);
		boolean found=false;
		for(Map.Entry<Character,Integer> x:map.entrySet())
		{
			if(x.getValue()==1)
			{
				found=true;
				u=x.getKey();
				break;
			}
		}
		if(found)
		
		return s.indexOf(u)+1;
		else
		return -1;
	}

}
