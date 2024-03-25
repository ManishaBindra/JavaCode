package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {7,8,5,3,4,1,2};

		 
		 for(int i=0;i<arr.length-1;i++) {
			int smallestIndex=i;
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[smallestIndex]>arr[j]) {
					 smallestIndex=j;
				 }
			 }
					 
					 int temp = arr[smallestIndex];
					 arr[smallestIndex] = arr[i];
					 arr[i]=temp;
				 }
	
	
	for (int i=0;i<arr.length;i++) {
		 System.out.print(" " + arr[i]);
	 }
		}

}
