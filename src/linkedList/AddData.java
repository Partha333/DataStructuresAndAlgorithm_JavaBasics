package linkedList;

public class AddData 
{
	public static void print(LinkedListNode<Integer> head)
	{
		LinkedListNode<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data)
	{
		int temp=0;
		LinkedListNode<Integer> tempObj=head;
		LinkedListNode<Integer> newObj=new LinkedListNode<>(data);
		while(tempObj!=null)
		{
			if(pos!=0)
			{
				if(temp==pos-1)
				{
					newObj.next=tempObj.next;
					tempObj.next=newObj;
				}
			}
			else
			{
				newObj.next=tempObj;
				return newObj;
			}
			tempObj=tempObj.next;
			temp++;	
		}
		return head;
	}
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> newObj=new LinkedListNode<>(12);
		LinkedListNode<Integer> newObj2=new LinkedListNode<>(23);
		LinkedListNode<Integer> newObj3=new LinkedListNode<>(34);
		newObj.next=newObj2;
		newObj2.next=newObj3;
		LinkedListNode<Integer> head=newObj;
		LinkedListNode<Integer> newHead=insert(head, 3, 52);
		print(newHead);
		
	}
}