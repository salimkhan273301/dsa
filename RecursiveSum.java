import java.util.Scanner;

public class RecursiveSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value in numaric form:");
		
		String number=sc.nextLine();
		System.out.println("Enter the string multiple size:");
		int k=sc.nextInt();
		// TODO Auto-generated method stub
		 

	}

	public static int superDigit(String number, int k) {
		
		if (number.length() > 1)
        {
            long sum = 0;
            for (int i = 0; i < number.length(); i++)
            {
                sum += Character.getNumericValue(number.charAt(i));
            }
            System.out.println("Sum of the string value is:");
            System.out.println(sum);
            System.out.println(superDigit(Long.toString(sum * k), 1));
           return superDigit(Long.toString(sum * k), 1);
        }
        else
        	//System.out.println(Character.getNumericValue(number.charAt(0)));
            return Character.getNumericValue(number.charAt(0));

	}

}
