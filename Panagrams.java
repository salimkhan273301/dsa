import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Panagrams {
	 public static String pangrams(String s) {
		    // Write your code here
		    s=s.toLowerCase();
		    s = s.replaceAll("\\s+", "");
		    Set<Character> set=new HashSet<>();
		    Map<Character,Integer> map=new HashMap<>();
		    char[] ch=s.toCharArray();
		    for(char x: ch)
		    {
		        set.add(x);
		        
		        if(map.containsKey(x))
		        {
		        	map.put(x, map.get(x)+1);
		        	
		        }
		        else
		        map.put(x,1);
		       
		    }
		    System.out.println(set.toString());
		    System.out.println(map.toString());
		        return set.size()==26?"pangram":"not pangram";
		    }

	public static void main(String[] args) {
		
		String s="amirullah";
		System.out.println( pangrams(s));
	}

}
