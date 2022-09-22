package Fundamental;

public class ArithmaticOperators 
{
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		int c= a+b;
		int d=a-b;
		int e=a/b;
		int f=a%b;
		int g=a+b/a;//precedence of (+&-) are same and (*,/,%) are same
//		precedence of (+&-) are lower than precedence of (*,/,%)
		int h=a*b/a;//Associativity works here from left to right but generally it should work from right to left
		System.out.println(c);
		System.out.println(d);
		System.out.println(g);
		System.out.println(h);
	}
}
