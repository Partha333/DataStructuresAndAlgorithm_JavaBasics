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

