package linkedList;

public class kReverse extends InputData
{
	
	public static LinkedListNode<Integer> reverseR(LinkedListNode<Integer> head,LinkedListNode<Integer> tail)
	{
		if(head==tail || head==null || head.next==null)
		{
			return head;
		}
		LinkedListNode<Integer> head2=reverseR(head.next,tail);
		LinkedListNode<Integer> tail2=head.next;
		tail2.next=head;
		head.next=null;
		return head2;
	}
	
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) 
    {
		if(k==0 || k==1 || head==null || head.next==null)
		{
			return head;
		}
		LinkedListNode<Integer> headtoreturn=null;
		LinkedListNode<Integer> headtemp=head;
		LinkedListNode<Integer> tailtemp=head;
        int indexcount=0,index=k-1;
        while(indexcount!=index)
        {
        	if(tailtemp.next==null)
        	{
            	headtoreturn=tailtemp;
        		break;
        	}
        	tailtemp=tailtemp.next;
        	indexcount++;
        	headtoreturn=tailtemp;
        }
        LinkedListNode<Integer> node=kReverse(headtoreturn.next,k);
        LinkedListNode<Integer> rHead=reverseR(headtemp,tailtemp);
        LinkedListNode<Integer> rHeadTemp=rHead;
        while(rHeadTemp.next!=null)
        {
        	rHeadTemp=rHeadTemp.next;
        }
        rHeadTemp.next=node;
        return rHead;
	}
	
	public static void main(String[] args) 
	{
		LinkedListNode<Integer> n1=new LinkedListNode<Integer>(1);
		LinkedListNode<Integer> n2=new LinkedListNode<Integer>(2);
		LinkedListNode<Integer> n3=new LinkedListNode<Integer>(3);
		LinkedListNode<Integer> n4=new LinkedListNode<Integer>(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		LinkedListNode<Integer> head=n1;
//		LinkedListNode<Integer> tail=n4;
		LinkedListNode<Integer> res=kReverse(head,3);
		print(res);
	}

}
