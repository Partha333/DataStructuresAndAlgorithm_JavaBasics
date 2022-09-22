package linkedList;

public class LinkedList 
{
	public static void increment(LlNode<Integer> head){
	    LlNode<Integer> temp = head;
	    while(temp != null){
	        temp.data++;
	        temp = temp.next;
	    }
	}
	
	public static void printLL(LlNode<Integer> head)
	{
		LlNode<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	public static LlNode<Integer> CreateNodes()
	{
		LlNode<Integer> l1=new LlNode<>(10);
		LlNode<Integer> l2=new LlNode<>(20);
		LlNode<Integer> l3=new LlNode<>(30);
		LlNode<Integer> l4=new LlNode<>(40);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		LlNode<Integer> head=l1;
		return head;
	}
	public static void main(String [] args)
	{
//		LlNode<Integer> l=new LlNode<>(333);
//		System.out.println("Address of the node 'l' Is: "+l+".");
//		System.out.println("Data of Node 'l' is: "+l.data);
		LlNode<Integer> head=CreateNodes();
		increment(head);
		printLL(head);
	}
}