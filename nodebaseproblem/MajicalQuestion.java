package nodebaseproblem;

import java.util.Scanner;
public class MajicalQuestion {
     public static void f(int C[],int n){
        for(int i=0; i<n; i++)
        {		int x=0;
             int notfound=-1;
         for(int j=i+1; j<n; j++)
            {
               if(C[i]<C[j])
                {
                        notfound=C[j];
                        x=j;
                        break;
                }
               
            }
             
            
         g(C,x,notfound);
         //System.out.print(notfound+" ");
         
         
        }
       

    }
public static void g(int B[],int l, int nf)
    {
    	int found=-1;
 for(int i=l+1; i<B.length; i++)
        {
              
        
        	 
               if(nf>B[i])
                {
                        found=B[i];
                        break;
                }
              
          }
 System.out.print(found+" "); 
 
 }
          
    
    
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int[] A= {3,7,1,7,8,4,5,2};
        int Size=A.length;
        //int Size=sc.nextInt();
//        int[] A=new int[Size];
//       
//        for(int j=0; j<Size; j++)
//        {
//            A[j]=sc.nextInt();
//        }
       
      f(A,Size);
    }
}

