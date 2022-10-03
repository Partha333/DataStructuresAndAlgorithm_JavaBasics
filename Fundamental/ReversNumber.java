<<<<<<< HEAD
package Fundamental;
import java.util.Scanner;
public class ReversNumber 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
	    int i=1,n,x=0,y;
	    n=s.nextInt();
	    while(i>0)
	    {
	        y=n%10;
	        x=x*10+y;
	        n=n/10;
	        i=n;
	    }
	    System.out.println(x);
	}
}
=======
package Fundamental;
import java.util.Scanner;
public class ReversNumber 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
	    int i=1,n,x=0,y;
	    n=s.nextInt();
	    while(i>0)
	    {
	        y=n%10;
	        x=x*10+y;
	        n=n/10;
	        i=n;
	    }
	    System.out.println(x);
	}
}
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
