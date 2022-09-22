package linkedList;

public class FindANum extends InputData
{
	public static int findNodeRec(LinkedListNode<Integer> head, int n) 
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==n)
        {
            return 0;
        }
        else
        {
        int num=findNodeRec(head.next, n);
        if(num!=-1)
        {
        	return num+1;
        }
            else{return -1;}
        }
	}
	
	public static void main(String[] args) 
	{
		
	}
}