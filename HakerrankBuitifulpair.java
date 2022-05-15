

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HakerrankBuitifulpair {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Inter the Size Of Array:");
        int len=s.nextInt();
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        for(int i=0;i<len;i++)
            {
            int current=s.nextInt();
            if(!hmap.containsKey(current))
                {
                
                hmap.put(current,1);
            }
            else
                {
                int temp=hmap.get(current);
                hmap.put(current,++temp);
            }
        }
        int counter=0;
        for(int i=0;i<len;i++)
            {
            int current=s.nextInt();
            if(hmap.containsKey(current))
            {
                int temp=hmap.get(current);
                if(temp>0)
                {
                    hmap.put(current,--temp);
                    counter++;
                }
                else
                    {
                    hmap.remove(current);
                }
                
            }
        }
        if(counter==len)
            System.out.println(counter-1);
        else if(counter<len)
            System.out.println(counter+1);
        else
            System.out.println(counter);
    }
}
