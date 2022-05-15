import java.util.HashMap;
import java.util.Map;

public class Anagramsdemo {
	 public static int makeAnagram(String a, String b) {
		    // Write your code here
		    int total=0;
		   Map<Character,Integer> map=new HashMap<>();
		   for(int i=0; i<a.length(); i++)
		   {
		       char c=a.charAt(i);
		       if(map.containsKey(c))
		       {
		           map.put(c, map.get(c)+1);
		       }
		       else{
		           map.put(c, 1);
		       }
		   }
		   for(int i=0; i<b.length(); i++)
		   {
		       char c1=b.charAt(i);
		       if(map.containsKey(c1))
		       {
		           map.remove(c1);
		       }
		       else{
		           map.put(c1, 1);
		       }
		       for(Map.Entry<Character,Integer> s:map.entrySet())
		       {
		           total=map.size();
		       }
		   }
		   System.out.println(map.toString());
		        return total;
		    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="fcrxzwscanmligyxyvym";
		String b="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		
		System.out.println( makeAnagram(a,b));

	}

}
