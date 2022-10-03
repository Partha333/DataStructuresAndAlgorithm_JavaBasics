<<<<<<< HEAD
package Fundamental;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n,t=1,res=0,y,x;
		n=s.nextInt();
		while(n>0)
		{
			y=n/10;
			x=n%10;
			res=res+x*t;
			n=y;
			t=t*2;
		}
		System.out.println(res);
	}

}
=======
package Fundamental;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n,t=1,res=0,y,x;
		n=s.nextInt();
		while(n>0)
		{
			y=n/10;
			x=n%10;
			res=res+x*t;
			n=y;
			t=t*2;
		}
		System.out.println(res);
	}

}
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
