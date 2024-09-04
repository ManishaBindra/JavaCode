package ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public 	UnderAgeException(String msg) {
		super(msg);
	}
}
class OverAgeException extends Exception{
	public 	OverAgeException(String msg) {
		super(msg);
	}
}

class Applicant{
	int name;
	int age ;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();
	}
	//we can write parent also
	public void verify() throws UnderAgeException, OverAgeException  {
		if(age<18) {
			UnderAgeException uae = new UnderAgeException("Ohh you are Under age");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60) {
			OverAgeException oae = new  OverAgeException("You are Over age");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("You are eligible");
		}
	}
}

class Rto{
	public void intiate(){
		Applicant a = new Applicant();
		
		try {
			a.input();
			a.verify();
		} catch (Exception e) {
			System.out.println("try again ");
			//e.printStackTrace();
	
			try {
				a.input();
				a.verify();
			} catch (Exception e1) {
				System.out.println("try again ");
				////2e.printStackTrace();
				e.printStackTrace();
			}
		}
		}
	}


public class ExceptionHandling8 {

	public static void main(String[] args) {
		Rto r = new Rto() ;
		r.intiate();
		}

	}


