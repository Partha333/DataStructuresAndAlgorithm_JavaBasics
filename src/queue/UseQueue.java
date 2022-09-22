package queue;
import java.util.*;
public class UseQueue extends KReverse
{
	public static void main(String [] args)
	{
//		QueueUsingArray q=new QueueUsingArray();
//		q.enqueue(10);
//		q.enqueue(20);
//		System.out.println(q.getSize());
//		try {
//			System.out.println(q.dequeue());
//		} catch (StackEmptyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(q.getSize());
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(reverseQueue(q,3));
//		System.out.println(q.poll());
//		System.out.println(q.size());
//		System.out.println(q.peek());
	}
}