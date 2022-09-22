package Fundamental;
import java.util.Scanner;
public class PrimeUsingReturn {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n,i=2;
		n=s.nextInt();
		while(n>i) 
		{
				if(n%i==0)
				{
					System.out.println("Not Prime");
					return;
				}
				i=i+1;
		}
			
		System.out.println("Prime");
	}

}
