package SearchingAlgo;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		
		System.out.println("Enter the key to be searched ");
		Scanner scan =new Scanner(System.in);
		int key = scan.nextInt();
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==arr[mid]) {
				System.out.println("Key " +key + " Found at index " + mid);
				break;
			}
			else if (key>arr[mid]) {
				low=mid+1;
			}
			
			else if (key<arr[mid]) {
				high=mid-1;
			}
		}
		if (low>high) {
			System.out.println("Key not found. ");
		}
	}

}
