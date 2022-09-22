package Fundamental;
import java.util.Scanner;
public class FtoCforAGivenRangeOfF {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b,i=0,s1,c;
		a=s.nextInt();
		b=s.nextInt();
		s1=s.nextInt();
		//System.out.println(s1);
		while(a<=b)
		{
			System.out.print(a+" ");
			c=((a-32)*5)/9;
			System.out.println(c);
			a=a+s1;
		}
	}

}
