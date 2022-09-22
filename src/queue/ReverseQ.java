package queue;

import java.util.Queue;

public class ReverseQ 
{
	static Queue<Integer> reverseQueue(Queue<Integer> q)
	{
		
		if (q.isEmpty() || q.size()==1)
	    {
	        return q;
	    }
		int data = q.peek();
		q.remove();
		q = reverseQueue(q);
	    q.add(data);
		return q;
		
//		if (q.isEmpty() || q.size()==1)
//	    {
//	        return q;
//	    }
//		int data = q.peek();
//		q.remove();
//		q = reverseQueue(q);
//	    q.add(data);
//		return q;
	}
}
