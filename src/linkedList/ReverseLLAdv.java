package linkedList;

public class ReverseLLAdv extends InputData
{
	public static DoubleNode reverseLLadv(LinkedListNode<Integer> head)
	{
		if(head.next==null || head==null)
		{
			DoubleNode h=new DoubleNode(head,head);
			return h;
		}
		else
		{
			DoubleNode h1= reverseLLadv(head.next);
			h1.tail.next=head;
			head.next=null;
			DoubleNode h2=new DoubleNode(h1.head,head);
			return h2;
		}
	}
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> head=createLL();
		PrintLL.print(head);
		System.out.println();
		DoubleNode head2=reverseLLadv(head);
		LinkedListNode<Integer> heaD=head2.head;
		PrintLL.print(heaD);
	}
}