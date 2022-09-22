package linkedList;

public class EvenAfterOdd extends InputData
{
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) 
    {
        if(head==null)
        {
            return head;
        }
        LinkedListNode<Integer> oddh=null,evenh=null;
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> otail=null;//1st odd
        LinkedListNode<Integer> etail=null;//1st even 
        while(temp!=null)
        {
            if(temp.data%2!=0)
            {
            	if(oddh==null)
            	{
            		oddh=temp;
            		otail=temp;
            		temp=temp.next;
            	}
            	else {
            	otail.next=temp;
            	otail=otail.next;
            	temp=temp.next;}
            }
            else
            {
            	if(evenh==null)
            	{
            		evenh=temp;
            		etail=temp;
            		temp=temp.next;
            	}
            	else {
            	etail.next=temp;
            	etail=etail.next;
            	temp=temp.next;}
            }
        }
        if(otail==null || etail==null)
        {
        	return head;
        }
        otail.next=evenh;
        return oddh;
	}
	
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> head= createLL();
		print(evenAfterOdd(head));
	}
}