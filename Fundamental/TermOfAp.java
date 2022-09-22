package Fundamental;
import java.util.Scanner;
public class TermOfAp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=0,j=1;
        for(int i=1;i<=n;i++)
        {
            while(j>0)
            {
            res=3*j+2;
            if(res%4==0)
            {
            	j=j+1;
            }
            else
            {
                System.out.print(res+" ");
                j=j+1;
                break;
            }
            }
        }

	}

}
