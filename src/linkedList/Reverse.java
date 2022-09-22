package linkedList;

public class Reverse extends InputData
{
	public static void printReverse(LinkedListNode<Integer> root) 
    {
		LinkedListNode<Integer> temp=root;
		LinkedListNode<Integer> prev=null;
		while(temp != null)
		{
			if(temp.next==null)
			{
				System.out.print(temp.data+" ");
				temp =prev;
				if(prev==null)
				{
					return;
				}
				prev.next=null;
				printReverse(root);
			}
			prev=temp;
			temp=temp.next;
		}
//		if(root.next==null)
//		{
//			System.out.println(root.data);
//			return;
//		}
//		LinkedListNode<Integer> temp=root;
//		while(temp!=null)
//		{
//			if(temp.next.next==null)
//			{
//				System.out.print(temp.next.data+" ");
//				temp.next=null;
//				printReverse(root);
//			}
//			temp=temp.next;
//		}
	}
	
	public static void main(String[] args) 
	{
		printReverse(createLL());
	}
}