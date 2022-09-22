package Fundamental;

public class LargestNum {

	public static void main(String[] args) {
		int n=-1234;
		int r1,r2,r3,r4,n1,n2,n3,n4;
        r1=n%10;
        n1=(n-r1)/10;
        r2=n1%10;
        n2=(n1-r2)+r1;
        r3=(n1/10)%10;
        r4=(n/100)/10;
        n3=(r3*100)+(r2*10)+r1;
        n4=(r4*100)+(r2*10)+r1;
        if(n1>n2&&n1>n3&&n1>n4)
        {
        	System.out.println( n1);
        }
        else if(n2>n1&&n2>n3&&n2>n4)
        {
        	System.out.println( n2);
        }
        else if(n3>n1&&n3>n2&&n3>n4)
        {
        	System.out.println( n3);
        }
        else
        {
        	System.out.println( n4);
        }
	}

}
