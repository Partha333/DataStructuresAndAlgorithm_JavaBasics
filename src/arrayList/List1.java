package arrayList;
import java.util.*;
public class List1 
{
	public static void print(List<Integer> l)
	{
		int length=0;
		while(length<l.size())
		{
			System.out.print(l.get(length)+" ");
			length++;
		}
	}
	public static List<Integer> createList()
	{
		List<Integer> l=new ArrayList<Integer>();
		return l;
	}
	public static void inputList(List<Integer> l,int n)
	{
		l.add(n);
	}
	public static void main(String [] args)
	{
		List<Integer> l=createList();
		inputList(l,333);
		inputList(l,343);
		inputList(l,353);
		inputList(l,363);
		inputList(l,373);
		inputList(l,383);
		print(l);
	}
}
