<<<<<<< HEAD
package Fundamental;

import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
	       int i,fn=1,prn=0,psn=1,n;
	       n=s.nextInt();
	    	   for(i=1;i<n;i++)
	    	   {
	    		   fn=prn+psn;
	    		   prn=psn;
	               psn=fn;
	    	   }
	       System.out.println(fn);
    }
}

=======
package Fundamental;

import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
	       int i,fn=1,prn=0,psn=1,n;
	       n=s.nextInt();
	    	   for(i=1;i<n;i++)
	    	   {
	    		   fn=prn+psn;
	    		   prn=psn;
	               psn=fn;
	    	   }
	       System.out.println(fn);
    }
}

>>>>>>> b631c201e596094d02b13f5125cd3e5e1c2d0e5e
