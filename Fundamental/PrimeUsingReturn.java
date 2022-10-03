<<<<<<< HEAD
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
=======
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
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
