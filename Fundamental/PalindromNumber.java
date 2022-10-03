<<<<<<< HEAD
package Fundamental;
import java.util.Scanner;
public class PalindromNumber 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
	    int i=1,n,x=0,y;
	    n=s.nextInt();
        int n1=n;
	    while(i>0)
	    {
	        y=n%10;
	        x=x*10+y;
	        n=n/10;
	        i=n;
	    }
        if(x==n1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

	    
	}
}
=======
package Fundamental;
import java.util.Scanner;
public class PalindromNumber 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
	    int i=1,n,x=0,y;
	    n=s.nextInt();
        int n1=n;
	    while(i>0)
	    {
	        y=n%10;
	        x=x*10+y;
	        n=n/10;
	        i=n;
	    }
        if(x==n1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

	    
	}
}
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
