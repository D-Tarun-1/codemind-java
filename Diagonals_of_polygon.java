import java.util.*;
public class diagonal
{
    public static void polygon(int m)
    {
        int p;
        p=(int)m*(m-3)/2;
        System.out.println(p);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        polygon(n);
        
    }
}