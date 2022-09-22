package linkedList;

public class ReverseLLR extends InputData
{
	public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		else
		{
			LinkedListNode<Integer> sHead=reverseLL(head.next);
			LinkedListNode<Integer> temp=sHead;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=head;
			head.next=null;
			return sHead;
		}
	}
	public static void main(String[] args) 
	{
		PrintLL.print(reverseLL(createLL()));
	}
}