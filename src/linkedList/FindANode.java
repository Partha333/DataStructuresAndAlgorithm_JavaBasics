package linkedList;

public class FindANode extends InputData
{
	public static int findNode(LinkedListNode<Integer> head, int n) 
	{
		LinkedListNode<Integer> temp=head;
		int flag=0;
		if(head==null)
		{
			return -1;
		}
		while(temp!=null)
		{
			if(temp.data==n)
			{
				break;
			}
			flag++;
			temp=temp.next;
			if(temp==null)
			{
				return -1;
			}
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> head=createLL();
		int node=findNode(head, 0);
		System.out.println(node);
	}
}