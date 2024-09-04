package ExceptionHandling;

import java.util.Scanner;
//rethrowing an expection which is already handled
//for this we can use throw keyword
class Alpha1 {
	void alpha() throws ArithmeticException 
	{
		System.out.println("Connection to calculator app establised");
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number to divide");
		int num1 = scan.nextInt();
		System.out.println("Enter Second number to divide");
		int num2 = scan.nextInt();
		int res = num1/num2;
		System.out.println("The result of dividion is: " +res);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception is handle in Alpha only");
			throw ae;
		}
		finally{
		System.out.println("Connection is terminated");

	}
}
}
	
public class ExceptionHandle4 {

	public static void main(String[] args) {
		
		try{
			System.out.println("Main Method");
			Alpha1 a = new Alpha1();
			a.alpha();
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());	
		System.out.println("Exception handled in main");
		
	}
	}
}

