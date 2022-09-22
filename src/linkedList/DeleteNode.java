package linkedList;

public class DeleteNode extends AddData
{
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) 
	{
		LinkedListNode<Integer> temp=head;
		int tempPos=0;
		while(temp!=null)
		{
			if(pos!=0)
			{
				if(tempPos==pos-1)
				{
					if(temp.next!=null)
					{
						temp.next=temp.next.next;
					}
					else
					{
						temp.next=null;
					}
				}
			}
			else
			{
				return head.next;
			}
			temp=temp.next;
			tempPos++;
		}
		return head;
	}
	public static void main(String [] args)
	{
		LinkedListNode<Integer> n1=new LinkedListNode<>(10);
		LinkedListNode<Integer> n2=new LinkedListNode<>(20);
		LinkedListNode<Integer> n3=new LinkedListNode<>(30);
		LinkedListNode<Integer> n4=new LinkedListNode<>(40);
		LinkedListNode<Integer> n5=new LinkedListNode<>(50);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n1=deleteNode(n1,4);
		print(n1);
	}
}
