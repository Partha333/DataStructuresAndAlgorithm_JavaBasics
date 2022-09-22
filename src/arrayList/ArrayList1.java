package arrayList;
import java.util.*;
public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(1,30);/*put '30' at index '1' and 
		slide all elements except elements on it's left towards right */
//		arr.set(1, 30);// "set()" will replace the element present at specified index
		System.out.println(arr.get(1));
		arr.remove(1);
//		for(int i=0;i<arr.size();i++)
//		{
//			System.out.print(arr.get(i)+" ");
//		}
		for(int i:arr) //for(Integer : arr) is also OK
		{
			System.out.print(i+" ");
		}
//		System.out.println(arr.size());
	}
}