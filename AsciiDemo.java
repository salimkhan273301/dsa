
public class AsciiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i='A'; i<='Z'; i++)
		{
			System.out.print((char)i+" ");
		}
		System.out.println();
		
		char i='a';
		while(i<='z') {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		char j='A';
		do {
			System.out.print(j+" ");
		}while(++j<='Z');

	}
	
	
			

}
