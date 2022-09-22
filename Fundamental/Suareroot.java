package Fundamental;
import java.util.Scanner;
public class Suareroot 
{
	public static void main(String [] args)
	{
		int i=1,n,flag=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n==0)
        {
            System.out.println(0);
            return;
        }
		while(n>0)
		{
			n=n-i;
			i=i+2;
			flag=flag+1;
			if(n==0)
			{
				System.out.println(flag);
			}
			else if(n<0)
			{
				System.out.println(flag-1);
			}
		}
	}
}
