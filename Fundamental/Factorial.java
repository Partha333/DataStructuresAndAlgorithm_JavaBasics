<<<<<<< HEAD
package Fundamental;
import java.util.Scanner;
public class Factorial
{
	public static int factorial(int num)
	{
		int factorial=1;
		while(num>0)
		{
			factorial*=num;
			num-=1;
		}
		return factorial;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		int result=factorial(num);
		System.out.println("Factorial of "+num+" is "+result);
	}
}
=======
package Fundamental;
import java.util.Scanner;
public class Factorial
{
	public static int factorial(int num)
	{
		int factorial=1;
		while(num>0)
		{
			factorial*=num;
			num-=1;
		}
		return factorial;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		int result=factorial(num);
		System.out.println("Factorial of "+num+" is "+result);
	}
}
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
