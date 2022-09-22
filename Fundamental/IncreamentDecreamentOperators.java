package Fundamental;

public class IncreamentDecreamentOperators 
{
	public static void main(String[] args) 
	{
		int a=3,b=4;
		if(++a>3&&b++>4)
		{
			System.out.println("if");
		}
		else
		{
			System.out.println("else");
		}
		System.out.println(a);
		System.out.println(b);
	}
}
