package queue;

public class QueueUsingLL 
{
	private Node front,rear;
	private int size;
	
	public QueueUsingLL()
	{
		
	}
	public int getSize()//1
	{
		return size;
	}
	public boolean isEmpty()//2
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void enqueue(int data)//3
	{
		Node newNode=new Node(data);
		size++;
		if(rear==null)
		{
			front=newNode;
			rear=newNode;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
	}
	public int dequeue() throws StackEmptyException//4
	{
		if(front==null)
		{
			throw new StackEmptyException();
		}
		int t=front.data;
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
		size--;
		return t;
		
	}
	public int front()//5
	{
		if(front==null)
		{
			return -1;
		}
		return front.data;
	}
}