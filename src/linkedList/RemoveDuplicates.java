package linkedList;

public class RemoveDuplicates extends InputData
{
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) 
    {
		if(head==null || head.next==null)
		{
			return head;
		}
		LinkedListNode<Integer> temp=head;
		LinkedListNode<Integer> temp2=temp.next;
		while(temp!=null)
		{
			while(temp.data.equals(temp2.data)) // .equals() can make a big difference.
			{
				temp2=temp2.next;
				if(temp2==null)
				{
					temp.next=null;
					return head;
				}
			}
			temp.next=temp2;
			temp=temp2;
			if(temp2.next==null)
			{
				return head;
			}
			else
			{
				temp2=temp2.next;
			}
		}
//		if(head==null || head.next==null)
//			{
//				return head;
//			}
//		LinkedListNode<Integer> temp= head;
//		while(temp.next!=null)
//		{
//			if(temp.data==temp.next.data)
//			{
//				temp.next=temp.next.next;
//			}
//			else
//			{
//				temp=temp.next;
//			}
//		}
		return head;
	}
	
	public static void main(String[] args) 
	{
		print(removeDuplicates(createLL()));
	}
}