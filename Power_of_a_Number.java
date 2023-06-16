import java.util.*;
public class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int b=sc.nextInt();
        int d=(int)Math.pow(n,m);
        int a=d%b;
        System.out.println(a);
    }
}