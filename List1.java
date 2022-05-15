import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("salim");
		list.add("nadeem");
		list.add("Hasim");
		list.add("Qasim");
		list.add("Nasir");
System.out.println(list);
System.out.println("printing the value after iteration:");
list.forEach((names)->System.out.println(names));
	}

}
