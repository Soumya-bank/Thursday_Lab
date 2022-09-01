// Find minimum maximum element from an array
package assignment25aug2022;

import java.util.Scanner;

public class MinimumMaximumElementArray {
		public static void main(String[] args) {
			int size,arr[],i,max,min;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of an array:");
			size=sc.nextInt();
			arr=new int[size];
	System.out.println("Enter " +size+" elements in Array:");
	for(i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	max=arr[0];min=arr[0];
	for(i=1;i<size;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	System.out.println("Minimum Number of Array is "+min);
	System.out.println("Maximum Number of Array is "+max);

	}

}
