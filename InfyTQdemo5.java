import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InfyTQdemo5 {

	public static void main(String[] args) {
		String[] s= {"black","gray","brown","red","pink"};
		List<String> list=new ArrayList<>();
		Collections.addAll(list,s);
		System.out.println(list.toString());
		int start=3;
		String target="black";
		System.out.println(foundStep(list,start,target));

	}

	private static int foundStep(List<String> list, int start, String target) {
		
		int endIndex=list.indexOf(target);
		int farward=0,backword=0;
		if(start==endIndex)return 0;
		else if(start-endIndex==1)return 1; 
		else if(start<endIndex)
		{
			farward=endIndex-start;
			backword= start+(list.size()-1-endIndex)+1;		
		}
		else if(start>endIndex)
		{
			farward=(list.size()-start-1)+endIndex+1;
			backword=start-endIndex;
		}
		return Math.min(farward, backword);
	}

}
