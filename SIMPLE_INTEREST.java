import java.util.*;
public class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int si=(p*t*r)/100;
        System.out.format("%d ",si);
    }
}