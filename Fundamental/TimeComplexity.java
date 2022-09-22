package Fundamental;
import java.util.Arrays;
public class TimeComplexity {

	public static void main(String[] args) {
//		int n=3;
//		for(int i=1;i<n;i++)
//		{
//			for(;i<n*n;i++)
//			{
//				System.out.println("Partha");
//			}
//		}
		int arr[]= {12,15,1,24,2,35,6,3,38,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
