package queue;
import java.util.*;
public class StackUsingQ 
{
	Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int curr_size;
    
    public int getSize() 
    { 
        return q1.size();
    }
    public boolean isEmpty() 
    {
        return q1.isEmpty();
    }
    public void push(int element) 
    {
        q2.add(element);
        while (!q1.isEmpty()) 
        {
    	   q2.add(q1.peek());
           q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    public int pop() 
    {
    	if (q1.isEmpty())
        {
        	return -1;
        }
        int c=q1.peek();
        q1.remove();
        return c;
    }
    public int top() 
    {
        if (q1.isEmpty())
        {
            return -1;
        }   
        return q1.peek();
    }
}