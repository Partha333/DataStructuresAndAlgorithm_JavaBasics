package linkedList;

public class LengthOfLL
{
	public static void addAtLast(LinkedListNode<Integer> head, int a)
	{
		LinkedListNode<Integer> temp=head;
		while(temp!=null)
		{
			if(temp.next==null)
			{
				LinkedListNode<Integer> node=new LinkedListNode<Integer>(a);
				temp.next=node;
			}
		}
	}
	
	public static void printIthNode(LinkedListNode<Integer> head, int i)
	{
		LinkedListNode<Integer> temp=head;
		int ir=0;
		while(temp!=null)
		{
			if(i==ir)
			{
				System.out.println(temp.data);
			}
			ir++;
			temp=temp.next;
		}
	}
	
	public static int length(LinkedListNode<Integer> head)
	{
		int length=0;
		while(head!=null)
		{
			length++;
			head=head.next;
		}
		return length;
	}
	
	public static LinkedListNode<Integer> CreateNodes()
	{
		LinkedListNode<Integer> l1=new LinkedListNode<>(3);
		LinkedListNode<Integer> l2=new LinkedListNode<>(4);
		LinkedListNode<Integer> l3=new LinkedListNode<>(5);
		LinkedListNode<Integer> l4=new LinkedListNode<>(2);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		LinkedListNode<Integer> head=l1;
		return head;
	}
	
	public static void main(String[] args)
	{
		LinkedListNode<Integer> l=CreateNodes();
		int size=length(l);
		System.out.println(size);
		printIthNode(l,3);
		
	}
}