import java.util.*;
public class decode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k,r;
        if(n>=3)
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(k=n-1;k>=1;k--)
            {
                for(r=1;r<=k;r++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("The pattern is not possible");
        }
    }
}