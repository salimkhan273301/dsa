import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountPair {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,1,3,2,1,5,3,7,1);
		pair(list);

	}

	private static void pair(List<Integer> list) {
		int pr=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int x:list)
		{
			if(map.containsKey(x))
			{
				pr++;
				map.remove(x);
			}
			else {
				map.put(x, 1);
			}
		}
		
		System.out.println(pr==0?-1:pr);
		System.out.println(map.toString());
	}

}
