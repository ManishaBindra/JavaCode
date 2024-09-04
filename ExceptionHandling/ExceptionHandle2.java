package ExceptionHandling;

import java.util.Scanner;

class Alpha {
	void alpha() throws ArithmeticException
	{
		System.out.println("Connection to calculator app establised");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number to divide");
		int num1 = scan.nextInt();
		System.out.println("Enter Second number to divide");
		int num2 = scan.nextInt();
		int res = num1/num2;
		System.out.println("The result of dividion is: " +res);
		System.out.println("Connection is terminated");
		}
	
	}
	
class Beta {
	void beta() throws ArithmeticException{
		Alpha a = new Alpha();
		a.alpha();	
	}
}
public class ExceptionHandle2 {

	public static void main(String[] args) {
		try {
		Beta b= new Beta();
		b.beta();
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception handled Successfully in main ");
			}
	}
}