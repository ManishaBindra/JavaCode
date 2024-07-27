package Loan;

import java.util.Scanner;

//Govt will provide the loan to all the farmers 

//Rate of interest will be decided by bank and it will be static as constant 

class Farmer{
	//Instace variable because the values are changing on the basis of Objects(Farmers)
	private float principalAmnt;
	private float timeDuration;
	private float simpleInterest;
	private static float rateOfInterest;
	
	static {//coz rate of interest will be the same 
		rateOfInterest = 3f;	
	}
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly enter the Principal Amount");
		principalAmnt= scan.nextFloat();
		System.out.println("Kindly mention the Time duration");
		timeDuration =scan.nextFloat();
	}
	
	void compute() {
		simpleInterest = (principalAmnt* timeDuration * rateOfInterest)/100;
	}
	
	void disp() {
		System.out.println("SimpleInterest is " + simpleInterest);

	}
}



public class FarmerLoan {

	public static void main(String[] args) {
	Farmer f1 = new Farmer();
	Farmer f2 = new Farmer();
	
	f1.input();
	f1.compute();
	f1.disp();
	
	f2.input();
	f2.compute();
	f2.disp();
	}

}
