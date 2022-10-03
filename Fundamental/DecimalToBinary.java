<<<<<<< HEAD
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
=======
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
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
