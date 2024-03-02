package Array;

import java.util.Arrays;

public class OperationsInArray {

	public static void main(String[] args) {
		//WAP to add the Values in array
		
				int[] ar= new int[4];
				System.out.println( "The elements of array is below");
				for(int elem:ar) {
					System.out.print( elem + " ");
				}
				System.out.println("");
				
				
				System.out.println("The elements of array after adding 5 is below" );
				Arrays.fill(ar, 5);
				for(int elem:ar) {
					System.out.print( elem + " ");
				}
				System.out.println("");
				
				int[] arr= {2,2,2,0,0,0};
				System.out.println("Adding the numbers in between the array is below" );
				Arrays.fill(arr, 2, 6, 9);
				for(int elem:arr) {
					System.out.print( elem + " ");
				}
				System.out.println("");
				
				int[] arrr= {30,40,70,10,20};
				System.out.println("Sorting of array" );
				Arrays.sort(arrr);
				for(int elem:arrr) {
					System.out.print( elem + " ");
				}
				System.out.println("");
				
				System.out.println("Binary search of sorted Array of element 30" );
				int BS=Arrays.binarySearch(arrr, 30);
				System.out.print(BS);
				
				System.out.println("");
				
				System.out.println("Binary search of sorted Array of element 50" );
				int BSS=Arrays.binarySearch(arrr, 50);
				System.out.print(BSS);
			}

		}
