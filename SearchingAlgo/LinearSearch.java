package SearchingAlgo;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,70,80,9};
		int key= 80;
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++) {
			if(key == arr[i]) {
				System.out.println("Key " + key + " found at index " + i);
				flag = true;
				break;
			}

		}
		if(flag ==false) {
		System.out.println("Key" + key + "not found at any index " );

	}
	}
}
