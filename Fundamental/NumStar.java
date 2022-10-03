<<<<<<< HEAD
package Fundamental;
import java.util.Scanner;
public class NumStar {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(n-j==i) {
					System.out.print("*");}
				else
				{
				System.out.print(n-j);
				}
			}
			System.out.println();
		}
	}

}
=======
package Fundamental;
import java.util.Scanner;
public class NumStar {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(n-j==i) {
					System.out.print("*");}
				else
				{
				System.out.print(n-j);
				}
			}
			System.out.println();
		}
	}

}
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
