import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int s=a+b;
             c=0;
            for(int j=1;j<=s;j++)
            {
                if(s%j==0)
                {
                    c++;
                }
            }
        if(c==2)
        {
            System.out.println("tevitt");
        }
        else
        {
            System.out.println("Satya");
        }
    }
}
}