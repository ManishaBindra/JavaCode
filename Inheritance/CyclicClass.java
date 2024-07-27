package Inheritance;

//Cyclic Inheritance is not allowed 

//class Demo1 extends Demo2{
	
//}


//class Demo2 extends Demo1{
	
//}

class Demo111{
	private	String name ;
	int age = 24;
	
	void disp() {
		System.out.println("Name and age of Person1 is " + name + " " +age );
	}	
}

class Demo112 extends Demo111{
	void disp1() {
		//Private member cannont access the Inhertance to preserrve the Encapsulation
		
		// name = "Manisha";
		//System.out.println("Name and age of Person1 is " + name + " " +age );
	}
}


public class CyclicClass {

	public static void main(String[] args) {
		Demo111 d = new Demo111();
		d.disp();
	}

}
