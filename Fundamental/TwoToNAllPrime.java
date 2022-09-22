package Fundamental;
import java.util.Scanner;
public class TwoToNAllPrime 
{
	public static void main(String[] args) 
	{
		/*Scanner s=new Scanner(System.in);
        int i,n;
       n=s.nextInt();
        for(i=2;i<=n;i++)
        {
          int flag=0;
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    flag=flag+1;
                }
               
            }
            if(flag==0)
            {
            	
                System.out.println(i);
            }
        }*/
//        for(j=2, i=2;i<=n;i++,j++)
//        {
//            int flag=0;
//            for(;j<=i-1;)
//            {
//                if(i%j==0)
//                {
//                    flag=flag+1;
//                }
//               
//            }
//            if(flag==0)
//            {
//            	
//                System.out.println(i);
//            }
//        }
		 for(int i=483;i>0;i=i%3)
		    {
		        System.out.print("*");
		    }
	}

}
