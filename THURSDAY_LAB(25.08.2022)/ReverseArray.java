// print reverse of an array
package assignment25aug2022;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Elements in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("Array Reverse Elements ");
		for(int i=arr.length-1;i>=0;i--)
		{
			
			System.out.println(arr[i]+" ");
		}
	}
}
