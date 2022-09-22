package linkedList;

public class DeleteN extends InputData
{
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) 
    {
		if(M==0)
        {
            return null;
        }if(N==0)
        {
        	return head;
        }
        LinkedListNode<Integer> tm=head,tn=head;
		while(tm!=null)
		{
			int cm=1,cn=1;
			while(cm!=M)
			{
				if(tm==null)
				{
					return head;
				}
				tm=tm.next;
				cm++;
                if(tm==null)
				{
					return head;
				}
			}
			tn=tm.next;
			while(cn!=N)
			{
				if(tn==null)
				{
					tm.next=null;
					return head;
				}
				tn=tn.next;
				cn++;
                if(tn==null)
				{
					tm.next=null;
					return head;
				}
			}
			tm.next=tn.next;
			tm=tn.next;
		}
		return head;
	}
	
	public static void main(String [] args)
	{
		LinkedListNode<Integer> head=createLL();
		LinkedListNode<Integer> head2=skipMdeleteN(head,0,3);
		print(head2);
	}
}