package Fundamental;

public class CountinueStmt {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println(i);
			i=i+1;
		}
	}

}
