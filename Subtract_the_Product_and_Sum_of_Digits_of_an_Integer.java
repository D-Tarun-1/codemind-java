import java.io.*;
public class product
{
    public static void main(String args[])throws Exception
    {
       int n,r,s=0,p=1,z=0;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       n=Integer.parseInt(br.readLine());
       while(n>0)
       {
           r=n%10;
           s=s+r;
           p=p*r;
           n=n/10;
       }
       z=p-s;
       System.out.println(z);    }
}