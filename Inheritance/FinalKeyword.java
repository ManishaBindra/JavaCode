package Inheritance;

final class Vehicle{
	void disp() {
		System.out.println(" vehicle Parent method");
	}
}
//Fianl class doesn't participate in Inhetiotance 	
	//class Car extends Vehicle{ // final class we cannnot inherit
		//}

 class Vehicle1{
	final int  i=10;
	final void disp() {
		//i=20;
		//Final variable act as Constant we cannot change it 		
		System.out.println(i);
		System.out.println(" vehicle Parent method");
	}
}
	
	class Car extends Vehicle1{ // final class we cannnot inherit
////Fianl method participate in Inhetiotance 			
// Final method can be inherited but we cannot Override it.		
//	void disp() {
//		
//	}	
	}


public class FinalKeyword {

	public static void main(String[] args) {
	Car c= new Car();
	c.disp();
	}
}
	


