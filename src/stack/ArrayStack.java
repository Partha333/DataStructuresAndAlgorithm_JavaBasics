package stack;

public class ArrayStack 
{
	int data[];
	int size,topIndex;
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
			return false;
	}
	public int top()
	{
		return data[topIndex];
	}
	public void push()
	{
		
	}
}