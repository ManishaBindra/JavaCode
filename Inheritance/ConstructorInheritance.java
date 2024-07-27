package Inheritance;


class Parentt {
	int a,b;
//Constructor	
	Parentt(){
		a=10;
		b=20;
		System.out.println("Parent constructor");
	}
	
	Parentt(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("Parent  Parameterised constructor");
	}
	
	void disp() {
		System.out.println("Parent Method");
		
	}
}

class Childd extends Parentt{
	int x,y;
	
	Childd(){
	super();
		x=100;
		y=200;
		System.out.println("Child constructor");

	}
	
	Childd(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println("Child  Parameterised constructor");
	}
	

	void disp() {
		System.out.println("Child Method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class ConstructorInheritance {

	public static void main(String[] args) {
		Childd c = new Childd();
		//Childd c1 = new Childd(50,60);
		//Parentt p = new Parentt(70,90);
		c.disp(); // coz we didn't gave anythin in super method that's why it doesn't call paramerised constructor of parent class
		

	}

}
