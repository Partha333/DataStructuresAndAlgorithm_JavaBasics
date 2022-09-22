package circularLinkedList;

import java.util.Scanner;

public class CLL
{
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=head)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
//	public static Node<Integer> create()
//	{
//		Scanner scan = new Scanner(System.in);
//		int data=scan.nextInt();
//		Node<Integer> head=null;
//		Node<Integer> tail=null;
//		Node<Integer> node=new Node<>(data);
//	}
//	public static void main(String [] args)
//	{
//		Node<Integer> head=create();
//		print(head);
//	}
}