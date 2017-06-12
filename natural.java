import java.io.*;
import java.util.*;
class natural
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int sum=0,m=0,n=0;
        while(t>0)
        {
            m=t%10;
            sum=sum+m;
            t=t/10;
        }
        System.out.println(sum);
    }
}
