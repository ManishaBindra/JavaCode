package ExceptionHandling;

import java.util.Scanner;
//below is the example of Exception try divide 100/0
public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Connection to calculator app establised ");
		Scanner scan = new Scanner(System.in);
		try
		{
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter Second number");
		int num2 = scan.nextInt();
		int res = num1/num2;
		System.out.println("The result of dividion is: " +res);
		}
		catch(ArithmeticException ae) {
			System.out.println("Please provide non zero dominator");
		}
		//2nd block
		int [] a;
		int elem;
		try {
			System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		a = new int[size];
	
		
		System.out.println("Enter the element to be  inserted");
		elem = scan.nextInt();
		System.out.println("Enter the postion of  element to be  inserted");
		int pos = scan.nextInt();
		a[pos] = elem;
		System.out.println("Element " +elem +" inserted at " +pos + " Successfully");
		}
		catch(NegativeArraySizeException nae) {
		System.out.println("Please provide positive");
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Be in your Limit");
		}
	
		catch(Exception ae) {
			System.out.println("Exception occured");
		}
		System.out.println("Connection terminated");

	}

}
