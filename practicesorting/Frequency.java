package practicesorting;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10 ,20, 20, 10, 10, 30, 50, 10, 20};
		int l=arr.length;
		freq(arr,l);

	}

	private static void freq(int[] arr, int l) {
		int count=0;
	    for(int i=0; i<l-1; i++)
	    {
	        for(int j=i+1; j<l; j++)
	        {
	            if(arr[i]==arr[j])
	            {
	                count++;
	                break;
	            }
	        }
	    }
	    System.out.println(count);
		
	}

}
