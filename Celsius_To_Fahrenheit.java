import java.util.*;
public class fahrenheit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        double f=(float)(n*9/5)+32;
        System.out.format("%.2f",f);
    }
}