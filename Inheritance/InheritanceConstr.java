package Inheritance;

class Parent{
	//constructor
	
	Parent(){
		System.out.println(" parent Constructor");
	}
	
	void disp1() {
		System.out.println("Display method");
	}
}

class Child extends Parent{
	void disp1() {
		System.out.println("2nd Display method");
	}
}

public class InheritanceConstr {

	public static void main(String[] args) {
		Parent p = new Parent();
		//Child c = new Child();
		//c.disp1();
		//p.disp1();
	}

}
