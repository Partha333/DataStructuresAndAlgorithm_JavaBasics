package linkedList;
import java.util.Scanner;
public class InputData2 
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
	
	public static LinkedListNode<Integer> createLL()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		LinkedListNode<Integer> head=null;
		 
		while(data!=-1)
		{
			LinkedListNode<Integer> newData=new LinkedListNode<>(data);
			if(head==null)
			{
				head=newData;
			}
			else
			{
				LinkedListNode<Integer> tail=head;
				while(tail.next!=null)
				{
					tail=tail.next;
				}
				tail.next=newData;
			}
			data=sc.nextInt();
		}
		sc.close();
		return head;
	}
	
	public static void main(String [] args)
	{
		print(createLL());
	}
}
