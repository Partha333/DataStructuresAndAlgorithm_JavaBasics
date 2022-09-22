package Fundamental;
import java.util.Scanner;
public class SumOfnNumbers 
{
	public static void main(String[]args)
	{
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int i=1,sum=0;
		while(i<=a)
		{
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
	}
}
