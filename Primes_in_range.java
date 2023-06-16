import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,s=0,c;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            c=1;
            for(j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    c=0;
                    break;
                }
            }
            if(c==1&&i!=1)
            {
                s++;
            }
        }
        System.out.println(s);
    }
}