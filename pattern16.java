import java.util.*;

public class pattern16{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     int nst=1,nsp=2*n-1-2;
     int row=1;
     while(row<=n)
     {
         int val=1;
         for(int j=1;j<=nst;j++)
         {
             System.out.print(val+"\t");
             val++;
         }

         for(int j=1;j<=nsp;j++)
         {
             System.out.print("\t");
         }

         if(row==n)
         nst=nst-1;

         int v2=nst;
         for(int j=1;j<=nst;j++)
         {
             System.out.print(v2+"\t");
             v2--;
         }

         System.out.println();

         nst++;
         nsp=nsp-2;
         row++;
     }

 }
}