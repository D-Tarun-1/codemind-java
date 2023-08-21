import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=1;
        for(int i=1;i<=b;i++)
        {
            if(i%2!=0)
            {
             c=a*i;   
             System.out.println(a+" x "+i+" = "+c);
            }
        }
    }
}