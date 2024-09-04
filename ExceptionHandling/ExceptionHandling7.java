package ExceptionHandling;

import java.util.Scanner;

class InvalidCustomException extends Exception{
	public InvalidCustomException(String msg) {
		super(msg);
	}
}

class Bank{
	int userId = 123;
	int password = 1111;
	int uId;
	int pW;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly enter the user ID ");
		uId = scan.nextInt();
		System.out.println("Kindly enter the Password ");
		pW = scan.nextInt();
	}
	
	public void verify() throws InvalidCustomException {
		if((userId ==uId)&& (password ==pW)) {
			System.out.println("Take your cash  ");
		}
		else {
			//let create custom exception onk 
			//System.out.println("Are you really a card owner ? "); 
			InvalidCustomException ice = new InvalidCustomException("Are you sure ?");
			//System.out.println(ice);
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}
	
	class Atm{
		public void initiate() {
			Bank b = new Bank();
			
			try {
				b.input();
				b.verify();
			} catch (InvalidCustomException e) {
				//e.printStackTrace();
				//giving second chance
				try {
					b.input();
					b.verify();
				} catch (InvalidCustomException ae) {
					//e.printStackTrace();
					//giving third chance chance
					try {
						b.input();
						b.verify();
					} catch (InvalidCustomException be) {
						be.printStackTrace();
						System.out.println("Chor uncle we caught you");
						System.exit(0);
					}
					
				}
			}
		}
	}


public class ExceptionHandling7 {

	public static void main(String[] args) {
		Atm a = new Atm();
		a.initiate();
	}

}
