package nodebaseproblem;

import java.util.Scanner;

public class LogicArray {
	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Please enter the Size of  Array:");
int n = scan.nextInt();
int arr[] = new int[n];
String fHalf ="";
String sHalf ="";
System.out.println("Please inter the element in array:");
for (int i = 0; i < n; i++) {
    arr[i] = scan.nextInt();
}
String x = "";
for (int i = 0; i < n / 2; i++) {
    x = String.valueOf(arr[i]);
    x = String.valueOf(x.charAt(0));
    System.out.println("char 0 " + x);
    fHalf = fHalf + x;
    System.out.println("first half " + fHalf);
}

String y = "";
for (int i = n / 2; i < n; i++) {
    y = String.valueOf(arr[i]);
    y = String.valueOf(y.charAt(y.length() - 1));
    System.out.println("char y " + y);
    sHalf = sHalf + y;
    System.out.println("last half " + sHalf);
}
String f = fHalf + sHalf;

int div = Integer.valueOf(f);
System.out.println(div);
if (div% 11 == 0) {
    System.out.println("OUI");

} else {
    System.out.println("NON");
}
	}
}
