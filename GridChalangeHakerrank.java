import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChalangeHakerrank {
	private static String sort(String x) {
	char[] ch=x.toCharArray();
	Arrays.sort(ch);
		
		return new String(ch);
	}
	
	private static String grid(List<String> list) {
		
		ArrayList<String> al=new ArrayList<>();
		for(String x:list)
		{
			String s=sort(x);
			al.add(s);
		
		}
		int l=al.get(0).length();
		
		System.out.println(al.toString());
		for(int i=1; i<al.size(); i++)
        {
			System.out.println(al.get(i-1));
            for(int j=0; j<l; j++)
            {
              if(al.get(i-1).charAt(j)>al.get(i).charAt(j))
              {
                  return "NO";
              }  
            }
        }
    // Write your code here
        return "YES";
	}



	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("xyb","cba","salim","khan");
		System.out.println(grid(list));

	}

	
}
