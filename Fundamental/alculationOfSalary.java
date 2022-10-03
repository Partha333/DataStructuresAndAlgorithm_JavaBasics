<<<<<<< HEAD
package Fundamental;
import java.util.Scanner;
public class alculationOfSalary {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int B_S,al=0,ts;
		double da,hra,pf;
		B_S=s.nextInt();
		String str=new String();
		str=s.next();
		char c=str.charAt(0);
		hra=0.2*B_S;
		da=0.5*B_S;
		pf=0.11*B_S;
		
		if(c=='A'||c=='a')
		{
			al=1700;
//			System.out.println(ts=(int)Math.round(B_S+da+hra+al-pf));
		}
		else if(c=='B'||c=='b')
		{
			al=1500;
//			System.out.println(ts=(int)Math.round(B_S+da+hra+al-pf));
		}
		else if(c=='C'||c=='c')
		{
			al=1300;
		}
		else
		{
			al=1300;
		}
		System.out.println(ts=(int)Math.round(B_S+da+hra+al-pf));
	}

}
=======
package Fundamental;
import java.util.Scanner;
public class alculationOfSalary {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int B_S,al=0,ts;
		double da,hra,pf;
		B_S=s.nextInt();
		String str=new String();
		str=s.next();
		char c=str.charAt(0);
		hra=0.2*B_S;
		da=0.5*B_S;
		pf=0.11*B_S;
		
		if(c=='A'||c=='a')
		{
			al=1700;
//			System.out.println(ts=(int)Math.round(B_S+da+hra+al-pf));
		}
		else if(c=='B'||c=='b')
		{
			al=1500;
//			System.out.println(ts=(int)Math.round(B_S+da+hra+al-pf));
		}
		else if(c=='C'||c=='c')
		{
			al=1300;
		}
		else
		{
			al=1300;
		}
		System.out.println(ts=(int)Math.round(B_S+da+hra+al-pf));
	}

}
>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
