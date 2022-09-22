package linkedList;

public class InsertNode extends InputData
{
	public static LinkedListNode<Integer> insertN(LinkedListNode<Integer> head, int pos, int el)
	{
		if(head==null && pos>0)
		{
			return head;
		}
		if(pos==0)
		{
			LinkedListNode<Integer> node=new LinkedListNode<>(el);
			node.next=head;
			return node;
		}
		else
		{
			LinkedListNode<Integer> shead=insertN(head.next,pos-1,el);
//			shead.next = head.next;
			head.next=shead;
			return head;
		}
	}
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> head=createLL();
		insertN(head,2,120);
		PrintLL.print(head);
	}
}