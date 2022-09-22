package Fundamental;
import java.util.Scanner;
public class DecimalToBinary
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextInt();
		long x=0,i=1,u,y;
		while(n>0)
		{
			u=n%2;
			y=n/2;
			x=x+(u*i);
			i=i*10;
			n=y;
		}
		System.out.println(x);
		//System.out.println(n);
	}
}
