package linkedList;

public class DeleteR extends InputData
{
	public static LinkedListNode<Integer> deleteN(LinkedListNode<Integer> head, int pos)
	{
		if(head==null/* || (head.next==null && pos>0)*/)
		{
			return head;
		}
		if(pos==0)
		{
			return head.next;
		}
		else
		{
			head.next=deleteN(head.next,pos-1);
			return head;
		}
			
	}
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> head=createLL();
		LinkedListNode<Integer> node=deleteN(head,0);
		PrintLL.print(node);
	}
}