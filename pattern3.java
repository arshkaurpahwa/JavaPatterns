import java.util.*;
public class pattern3 
{public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        /*for(int row=1;row<=n;row++)
        {
            int stars=row;
            int space=n-stars;        
            for(int i=1;i<=space;i++)
            {
                System.out.print("\t");
            }
            for(int i=1;i<=stars;i++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }*/

        for(int row=1;row<=n;row++)
        {
        for(int i=n-1;i>=1;i++)
        {
           System.out.print("\t"); 
        }
        for(int j=1;j<=n;j++)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }
    }
}