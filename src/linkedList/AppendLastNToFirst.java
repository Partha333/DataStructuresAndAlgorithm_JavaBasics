package linkedList;

public class AppendLastNToFirst extends InputData
{
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) 
    {
		LinkedListNode<Integer> temp=head;
		LinkedListNode<Integer> head1=null;
		int flag=0;
		while(temp!=null)
		{
			flag+=1;
			temp=temp.next;
		}
		int flag1=flag-(n+1);
		flag=0;
		temp=head;
		while(temp!=null)
		{
			if(flag==flag1)
			{
				head1=temp;
			}
			if(temp.next==null)
			{
				
				temp.next=head;
				head=head1.next;
				head1.next=null;
				break;
			}
			flag++;
			temp=temp.next;
		}
		return head;
    }
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> node=createLL();
		node=appendLastNToFirst(node,5);
		print(node);
		
	}
}