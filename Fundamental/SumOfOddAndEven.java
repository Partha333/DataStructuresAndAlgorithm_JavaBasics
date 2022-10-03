<<<<<<< HEAD
package Fundamental;
import java.util.Scanner;
public class SumOfOddAndEven {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=0,d_r=0;
		int esum=0,osum=0;
	while(n>0)
	{
		d_r=n/10;
		r=n%10;
		//System.out.println(d_r+" "+r);
		if(r%2==0)
			{
				esum=esum+r;
			}
			else
			{
				osum=osum+r;
			}
		n=d_r;
	}
		//System.out.println(d_r);
		System.out.print(esum+" ");
		System.out.println(osum);
//		while(n>=0) I was putting the process into an infinite loop as 
		//after the last digit d_r is going to be constantly zero and it was accepted by the loop
//		{
//			d_r=n/10;
//			r=n%10;
//			if(r%2==0)
//			{
//				esum=esum+r;
//			}
//			else
//			{
//				osum=osum+r;
//			}
//			n=d_r;
//		}
//		System.out.println(esum);
//		System.out.println(osum);
	}

}
=======
package Fundamental;
import java.util.Scanner;
public class SumOfOddAndEven {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=0,d_r=0;
		int esum=0,osum=0;
	while(n>0)
	{
		d_r=n/10;
		r=n%10;
		//System.out.println(d_r+" "+r);
		if(r%2==0)
			{
				esum=esum+r;
			}
			else
			{
				osum=osum+r;
			}
		n=d_r;
	}
		//System.out.println(d_r);
		System.out.print(esum+" ");
		System.out.println(osum);
//		while(n>=0) I was putting the process into an infinite loop as 
		//after the last digit d_r is going to be constantly zero and it was accepted by the loop
//		{
//			d_r=n/10;
//			r=n%10;
//			if(r%2==0)
//			{
//				esum=esum+r;
//			}
//			else
//			{
//				osum=osum+r;
//			}
//			n=d_r;
//		}
//		System.out.println(esum);
//		System.out.println(osum);
	}

}
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
