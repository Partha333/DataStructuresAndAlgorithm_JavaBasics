package linkedList;

public class PrintLLR extends InputData
{
	public static void printLLR(LinkedListNode<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		else
		{
			printLLR(head.next);
			System.out.print(head.data+" ");
		}
	}
	public static void main(String[] args) 
	{
		printLLR(createLL());
	}
}