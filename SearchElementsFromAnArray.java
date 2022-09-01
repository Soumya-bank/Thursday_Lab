// Write a program to search an user given element from an array
package assignment25aug2022;

	import java.util.Scanner;

	public class SearchElementsFromAnArray {

		public static void main(String[] args) {
			int size,search,arr[],i,pos=-1;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of an array:");
			size=sc.nextInt();
			//instantiate array
			arr=new int[size];
			//initialize array
	System.out.println("Enter " +size+" elements in Array:");
	for(i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter Elements You Want to Searching for:");
	search=sc.nextInt();

	// found the elements
		for(i=0;i<size;i++) {
			if(arr[i]==search){
				pos=i;
				break;
			}
		}
		if(pos!=-1) {
			System.out.println("Data found at "+(pos+1)+" position");
		}
		else {
			System.out.println("data not found");
		}
	}
	}
