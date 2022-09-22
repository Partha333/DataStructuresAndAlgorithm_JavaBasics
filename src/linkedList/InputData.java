package linkedList;
import java.util.Scanner;
public class InputData 
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
		LinkedListNode<Integer> tail=null;
		 
		while(data!=-1)
		{
			LinkedListNode<Integer> newData=new LinkedListNode<>(data);
			if(head==null)
			{
				head=newData;
				tail=head;
			}
			else
			{
				tail.next=newData;
				tail=newData; 
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