package Array;

public class MaxElemInArray {

	public static void main(String[] args) {
		int[] arr = {10,60,30,90,40};
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max = arr[i];
		}
		}
		System.out.println("The Maximun value is  "+ max);	
	}

}
