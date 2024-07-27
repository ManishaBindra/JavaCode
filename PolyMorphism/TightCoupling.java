package PolyMorphism;


class Parent10{
	public void PMethod(){
	System.out.println("Parent class is calling");
}
}
class Childone extends Parent10{
	public void PMethod(){
		System.out.println("Child class is calling");
	}
}
class Childtwo extends Parent10{
	public void PMethod(){
		System.out.println("Child2 class is calling");
	}
}
public class TightCoupling {

	public static void main(String[] args) {
		Childone c1 = new  Childone();
		c1.PMethod();
		
		Childtwo c2 = new  Childtwo();
		c2.PMethod();
	}

}
