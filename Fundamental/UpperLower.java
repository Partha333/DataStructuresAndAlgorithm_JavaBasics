<<<<<<< HEAD
package Fundamental;
import java.util.Scanner;
public class UpperLower {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=new String();
		str=s.next();
		char c=str.charAt(0);
		int a=c;
		//System.out.println(a);
		if((a<123&&a>96) || a>96)
		{
			System.out.println(0);
		}
		else if((a<93&&a>66) || a>66)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(-1);
		}
	}

}
=======
package Fundamental;
import java.util.Scanner;
public class UpperLower {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=new String();
		str=s.next();
		char c=str.charAt(0);
		int a=c;
		//System.out.println(a);
		if((a<123&&a>96) || a>96)
		{
			System.out.println(0);
		}
		else if((a<93&&a>66) || a>66)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(-1);
		}
	}

}
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
