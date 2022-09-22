package linkedList;

public class BubbleSort extends InputData
{
	
	public static  LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) 
    {
        if(head==null || head.next==null)
        {
        	return head;
        }
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> tail=null;
        while(temp.next != null)
        {
        	temp=temp.next;
        }
        tail=temp;
        temp=head;
        while(tail != head)
        {
            LinkedListNode<Integer> prev=head;
            while(temp!=tail && prev!=tail)
            {
            	if(temp.data <= temp.next.data)
            	{
            		prev=temp;
                	temp=temp.next;
            	}
            	else
            	{
            		if(temp==head)
            		{
            			LinkedListNode<Integer> t=temp.next;
            			head=t;
            			temp.next=t.next;
            			t.next=temp;
                    	prev=head;
                    	if(temp.next==null)
                    	{
                    		return head;
                    	}
            		}
            		else
            		{
            			prev.next=temp.next;
            			temp.next=temp.next.next;
            			prev.next.next=temp;
            			prev=prev.next;
            			if(temp.next==null)
                    	{
                    		break;
                    	}
            		}
            	}
            }
        	tail=prev;
        	temp=head;
        }
        return head;
	}
	
	public static void main(String[] args) 
	{
		print(bubbleSort(createLL()));
	}
}