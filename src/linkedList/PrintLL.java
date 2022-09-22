package linkedList;

public class PrintLL extends InputData
{
	public static void print(LinkedListNode<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		else
		{
			System.out.print(head.data+" ");
			print(head.next);
		}
	}
	public static void main(String[] args) 
	{
		print(createLL());
	}
}