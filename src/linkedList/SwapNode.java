package linkedList;

public class SwapNode extends InputData
{
	
	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j)
    {
		if(head==null || head.next==null || i==j)
		{
			return head;
		}
		LinkedListNode<Integer> temp=head;
		LinkedListNode<Integer> iprev=null,jprev=null;
		LinkedListNode<Integer> inode=null,jnode=null;
		int icount=0,jcount=0;
		if(i==0)
		{
			inode=head;
		}
		while(icount!=i && i!=0)
		{
			iprev=temp;
			temp=temp.next;
			inode=temp;
			icount++;
		}
		temp=head;
		if(j==0)
		{
			jnode=head;
		}
		while(jcount!=j && j!=0)
		{
			jprev=temp;
			temp=temp.next;
			jnode=temp;
			jcount++;
		}
		if(inode==head)
		{
			jprev.next=inode;
			head=jnode;
			temp=inode.next;
			inode.next=jnode.next;
			jnode.next=temp;
		}
		else if(jnode==head)
		{
			iprev.next=jnode;
			head=inode;
			temp=jnode.next;
			jnode.next=inode.next;
			inode.next=temp;
		}
		else
		{
			jprev.next=inode;
			iprev.next=jnode;
			temp=inode.next;
			inode.next=jnode.next;
			jnode.next=temp;
		}
		return head;
	}

	public static void main(String[] args) 
	{
		print(swapNodes(createLL(),4,0));
	}

}
