package Inheritance;

class Parent0{
	void disp() {
		System.out.println(" Parent method");
	}
	void disp1() {
		System.out.println(" Parent method");
	}	

class Child extends Parent0{
	//private void disp() {--> it'll throw error becoz we cannot reduce the visibility --- RULE  1 
	public void disp() {
		System.out.println(" child method");
		}
//sprciased method with method overloading exist 	
	public  int disp1(int a) {
			System.out.println(" Parent method");
			return a;
		}
	 
	 
	}
}


// 2nd Rule - return type must be same of overidden method 

class Parent111{
	int disp() {
		return 12;
	}
	

class Child1 extends Parent111{
	//private void disp() {--> it'll throw error becoz we cannot reduce the visibility --- RULE  1 
	public int disp() {
		return 4;
	}
}


//Rule 3 
//the retun type of Overridden method can be change if the there is co-varient return type (IS-A RELATIONSHIP)

class Interest{
	
}
class InterestPersonalLoan extends Interest{
	
}

class Loans{
	//public void interest() {// whatever we are returning we have to give it to return type 
	public Interest interest() {
	Interest it = new Interest(); 
	return it;
}

class PersonalLoan extends Loans {
	public InterestPersonalLoan interest() {
		InterestPersonalLoan ipl = new InterestPersonalLoan();	
		return ipl;
	}
}
		
	}
}


public class RulesInhertanReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
