package Fundamental;
import java.util.Scanner;
public class NumberSeuence
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c,comp=0,dflag=0,iflag=0;
        boolean res=true;
        for(int i=1;i<=n-1;i++)
        {
            if(i==1)
            {
            	c=s.nextInt();
            	comp=s.nextInt();
                if(c>comp)
                {
                    dflag=dflag+1;
                    res=true;
                }
                else
                {
                    iflag=iflag+1;
                    res=true;
                }
                
            }
            else
            {
                c=s.nextInt();
                if(c>comp)
                {
                    iflag=iflag+1;
                    res=true;
                    comp=c;
                }
                else if(c<comp)
                {
                    if(iflag>0)
                    {
                        res=false;
                        break;
                    }
                    else
                    {
                        dflag=dflag+1;
                        res=true;
                        comp=c;
                    }
                }
                else
                {
                    res=false;
                    break;
                }
            }
	}
        System.out.println(res);
}
}
