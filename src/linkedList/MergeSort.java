/*mid point of LL, merge to sorted LL, merge sort of LL*/
package linkedList;

public class MergeSort extends InputData
{
	
	public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) 
    {
        if(head1==null)
        {
            return head2;
        }
        if(head2==null)
        {
            return head1;
        }
        LinkedListNode<Integer> head=null,tail=null;
        LinkedListNode<Integer> t1=head1,t2=head2;
        if(t1.data<=t2.data)
        {
            head= t1;
            tail=t1;
            t1=t1.next;
        }
        else
        {
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1!=null && t2!=null)
        {
            if(t1.data<=t2.data)
            {
                tail.next=t1;
                tail=tail.next;
                t1=t1.next;
            }
            else
            {
                tail.next=t2;
                tail=tail.next;
                t2=t2.next;
            }
        }
        if(t1==null)
        {
            tail.next=t2;
        }
        if(t2==null)
        {
            tail.next=t1;
        }
        return head;
    }
	
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) 
    {
		 if(head==null || head.next==null)
	        {
	            return head;
	        }
	        LinkedListNode<Integer> slow=head, fast=head;
	        while(fast.next!=null && fast.next.next!=null)
	        {
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        LinkedListNode<Integer> f= slow.next;
	        slow.next=null;
	        LinkedListNode<Integer> h1= mergeSort(head);
	        LinkedListNode<Integer> h2= mergeSort(f);
	       return mergeTwoSortedLinkedLists(h1,h2);  
	}
	
	
	public static void main(String [] args)
	{
		print(mergeSort(createLL()));
	}
}