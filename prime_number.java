import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,count=0;
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
        System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}