package Array;

public class StoreArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			sum= sum+arr[i];
			
		}
		System.out.print("Storing the array is " +sum);

		//long i =10l;
		//int [] arr = new int[(int) i];
		//System.out.println(arr.length);
	}

}
