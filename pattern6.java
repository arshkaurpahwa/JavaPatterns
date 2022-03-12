import java.util.*;

public class pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int star=n/2 +1;
        int space=1;
        for(int row=1;row<=n;row++)
        {
            for(int i=1;i<=star;i++)
            {
                System.out.print("*\t");
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }
            for(int i=1;i<=star;i++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            if(row<n/2+1)
            {
                space=space+2;
                star=star-1;
            }
            else
            {
                space=space-2;
                star=star+1;
            }
        }

    }
}