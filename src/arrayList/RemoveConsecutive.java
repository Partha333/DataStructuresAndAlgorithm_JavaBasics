package arrayList;
import java.util.*;
public class RemoveConsecutive 
{
	public static ArrayList<Integer> removeCon(ArrayList<Integer> arr)
	{
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(arr.get(0));
		int flag=arr1.get(0);
		for(int i=1;i<arr.size();i++)
		{
			if(flag!=arr.get(i))
			{
				arr1.add(arr.get(i));
				flag=arr.get(i);
			}
		}
		return arr1;
	}
	public static void printAL(ArrayList<Integer> arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String []args)
	{
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(20);
		arr.add(10);
		arr.add(30);
		arr.add(50);
		arr.add(30);
		printAL(arr);
		ArrayList<Integer> result=removeCon(arr);
		printAL(result);
	}
}