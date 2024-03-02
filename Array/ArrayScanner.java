package Array;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
	int[] arr = new int[5];
	Scanner scan= new Scanner(System.in);
	
	for (int i=0; i<arr.length; i++) {
		System.out.println("Enter the Marks of Students " + i);
		arr[i] = scan.nextInt();
	}
	System.out.println("Marks of the students are as follows(Copying data from Console ) ");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	}

}
