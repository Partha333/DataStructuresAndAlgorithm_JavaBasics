package Fundamental;
import java.util.Scanner;
public class Ap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=0,num2=0,iflag=0,dflag=0,iflag2=0,dflag2=0;
		for(int i=1;i<=n-1;i++)
		{
			
			if(i==1)
			{
				num=s.nextInt();
				num2=s.nextInt();
				if(num<num2)
				{
					iflag=num2-num;
				}
				else if(num>num2)
				{
					dflag=num-num2;
				}
				else
				{
					System.out.println("true");
					return;
				}
				num=num2;
			}
			//System.out.println(num);
			
			else
			{
				num2=s.nextInt();
				if(num2>num)
				{
					if(num2-num!=iflag)
					{
						//System.out.println("false");
						iflag2=num2-num;
					}
					else
					{
						//System.out.println("true");
						num=num2;
					}
				}
				else if(num2<num)
				{
					if (num-num2!=dflag)
					{
						//System.out.println("false");
						dflag2=num-num2;
						//return;
					}
					else
					{
						num=num2;
					}
				}
				else
				{
					System.out.println("false");
					return;
					
				}
			}
			
		}
		if(iflag==iflag2||dflag==dflag2)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(true);
		}

	}

}
