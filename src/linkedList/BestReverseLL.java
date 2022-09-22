package linkedList;

public class BestReverseLL extends InputData
{
	public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		else
		{
			LinkedListNode<Integer> h1=reverseLL(head.next);
			LinkedListNode<Integer> tail=head.next;
			tail.next=head;
			head.next=null;
			return h1;
		}
	}
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> head=createLL();
		LinkedListNode<Integer> head1=reverseLL(head);
		PrintLL.print(head1);
	}
}