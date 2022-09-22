package Fundamental;
import java.util.Scanner;
public class Exponential 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int x,n,i=1,j=1;
		x=s.nextInt();
		n=s.nextInt();
		while(i<=n)
		{
			j=j*x;
			i=i+1;
		}
		System.out.println(j);
	}
}
