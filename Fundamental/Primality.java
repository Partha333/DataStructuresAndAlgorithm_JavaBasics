<<<<<<< HEAD
package Fundamental;
import java.util.Scanner;
public class Primality {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),i=2,j=0;
		while(i<a) 
		{
			if(a%i==0)
			{
				j=j+1;
			}
			i=i+1;
		}
		if(j>1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime number");
		}
		/*Scanner s=new Scanner (System.in); //This will run correctly for every number except 2
	    int n=s.nextInt();
	    boolean isprime=true;
	    if(n%2==0)
	        isprime=false;
	    int i=3;
	    while(isprime&&i<n)
	    {
	        isprime=!(n%i==0);
	        i+=2;
	    }
	    if(isprime)
	    {
	        System.out.println("Prime");
	    }
	    else
	    {
	        System.out.println("Composite");
	    }*/
	}

}
=======
package Fundamental;
import java.util.Scanner;
public class Primality {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),i=2,j=0;
		while(i<a) 
		{
			if(a%i==0)
			{
				j=j+1;
			}
			i=i+1;
		}
		if(j>1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime number");
		}
		/*Scanner s=new Scanner (System.in); //This will run correctly for every number except 2
	    int n=s.nextInt();
	    boolean isprime=true;
	    if(n%2==0)
	        isprime=false;
	    int i=3;
	    while(isprime&&i<n)
	    {
	        isprime=!(n%i==0);
	        i+=2;
	    }
	    if(isprime)
	    {
	        System.out.println("Prime");
	    }
	    else
	    {
	        System.out.println("Composite");
	    }*/
	}

}
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
