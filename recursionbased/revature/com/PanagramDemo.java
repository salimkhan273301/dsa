package recursionbased.revature.com;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PanagramDemo {

    protected static String getOutput(String sentence) {
        return (isPangram(sentence)) ? "pangram" : "not pangram";
    }

    protected static boolean isPangram(String sentence) {
        String lowerSentence = sentence.toLowerCase();
        Set<Character> set=new HashSet<>();
        for (char i = 'a'; i <= 'z'; i++) {
        	//set.add((char) lowerSentence.indexOf(i));
            if (lowerSentence.indexOf(i) < 0) return false;
            
        }
        //System.out.println(set.toString());
        
        return true;
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        System.out.println(PanagramDemo.getOutput(in.nextLine()));
    }

}