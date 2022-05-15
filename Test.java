import java.util.Scanner;

public class Test
{

    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the no of Row:");
    	int row=sc.nextInt();
    	System.out.println("Enter the no of Column:");
    	int col=sc.nextInt();
        int[][] table = new int[row][col];

        int count = 0;
        for (int i = 0; i < table.length; i++)
        {
            for (int j = 0; j < table[0].length; j++)
            {
                table[i][j] = count;
                count++;
                System.out.print(table[i][j] + " ");//it will print the no of space avalable for the element
            }
        }
    }
}
