package linkedList;

public class Palindrom extends InputData 
{
	public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		else
		{
			LinkedListNode<Integer> h1=reverseLL(head.next);
			LinkedListNode<Integer> tail=head.next;
			tail.next=head;
			head.next=null;
			return h1;
		}
	}
	public static boolean isPalindrome(LinkedListNode<Integer> head) 
    {
		LinkedListNode<Integer> head2=reverseLL(head);
		while(head!=null && head2!=null)
		{
			if(head.data==head2.data)
			{
				head=head.next;
				head2=head2.next;
			}
			else
			{
				return false;
			}
		}
		if(head.data==null && head2.data==null)
		{
			return true;
		}
		else
			return false;
    }
	
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> node=createLL();
		System.out.println(isPalindrome(node));
	}
}