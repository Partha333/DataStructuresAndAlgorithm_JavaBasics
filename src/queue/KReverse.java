package queue;

import java.util.LinkedList;
import java.util.Queue;

public class KReverse 
{
	static Queue<Integer> q1=new LinkedList<Integer>();
	static Queue<Integer> q2=new LinkedList<Integer>();
	static Queue<Integer> q3=new LinkedList<Integer>();
	static Queue<Integer> reverseQueue(Queue<Integer> q, int k)
	{
		if (q.isEmpty() || q.size()==1 || k==0)
	    {
	        return q;
	    }
		int data=q.poll();
		q3.add(data);
		q = reverseQueue(q,k-1);
		while(!q.isEmpty())
		{
			q2.add(q.poll());
		}
	    q1.add(data);
	    if(q3.peek()==data)
	    {
	    	while(!q2.isEmpty())
	    	{
	    		q1.add(q2.poll());
	    	}
	    	q=q1;
	    }
		return q;
	}
	
//	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) 
//    {
//        if(k==0)
//        {
//        	return input;
//        }
//        int data=input.peek();
//        input.remove();
//        
//	}
}