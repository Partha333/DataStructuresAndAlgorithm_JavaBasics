package queue;

public class QueueUsingArray 
{
	private int input[];
	private int size,front,rear;
	public QueueUsingArray()
	{
		input=new int[10];
		front=-1;
		rear=-1;
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
	public int getFront()throws StackEmptyException//3
	{
		if(size==0)
		{
			throw new StackEmptyException();
		}
		return input[front];
	}
	
	private void doubleCapacity()//4
	{
		int temp[]=input;
		int index=0;
		input=new int[size*temp.length];
		for(int i=front;i<temp.length;i++)
		{
			input[index++]=temp[i];
		}
		for(int i=0;i<front-1;i++)
		{
			input[index++]=temp[i];
		}
		front=0;
		rear=temp.length-1;
	}
	
	public void enqueue(int data)//5
	{
		if(size==input.length)
		{
			doubleCapacity();
		}
		if(size==0)
		{
			front=0;
		}
		rear++;
		if(rear==input.length)
		{
			rear=0;
		}
		input[rear]=data;
		size++;
	}
	public int dequeue()throws StackEmptyException//6
	{
		if(size==0)
		{
			throw new StackEmptyException();
		}
		int temp=input[front];
		front++;
		if(front==input.length)
		{
			front=0;
		}
		size--;
		if(size==0)
		{
			front-=1;
			rear-=1;
		}
		return temp;
	}
}