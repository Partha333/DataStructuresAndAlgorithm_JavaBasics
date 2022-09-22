package Fundamental;

public class Break {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j);
				if(j==i)
				{
					break;
				}
			}
			System.out.println();
		}
//		for(int i=7;i!=0;i--)
//	    {
//	        System.out.print(i--);
//	    }
	}

}
