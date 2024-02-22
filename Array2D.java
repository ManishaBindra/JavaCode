package Array;

import java.util.Scanner;
//WAP to store marks of 3  class each with 4 students
public class Array2D {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int [][] arr = new int [3][4];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of Class " + i +" student " + j);
				arr[i][j] = scan.nextInt();
				}
			}
			System.out.println("Marks of students are ");
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
				
				}
				System.out.println();
			}
    }
}