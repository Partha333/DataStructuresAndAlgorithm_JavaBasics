package Fundamental;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i=1,m=0;
        while(i<=10)
        {
            m=n*i;
            System.out.println(m);
            i=i+1;
	}

}
}
