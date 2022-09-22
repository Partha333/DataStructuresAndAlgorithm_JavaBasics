package linkedList;

public class IncreaseBy1 extends InputData
{
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) 
	{
		if(head==null)
		{
			return head;
		}
		if(head.next==null)
		{
			head.data=head.data+1;
			return head;
		}
		
		LinkedListNode<Integer> h1=nextLargeNumber(head.next);
//		if(head.next.data>=9)
//		{
//            int k=h1.data/10;
//			head.next.data=h1.data%10;
//			head.data=head.data+k;
//		}
		if(h1.data%10==0 || h1.data%10>=10)
		{
//			System.out.println(h1.data);
			int d=h1.data/10;
			int r=h1.data%10;
			head.next.data=r;
			head.data+=d;
		}
		return head;
		
	}
	
	public static void main(String [] args)
	{
		print(nextLargeNumber(createLL()));
	}
	
}