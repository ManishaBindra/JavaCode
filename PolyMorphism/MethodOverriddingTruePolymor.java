package PolyMorphism;

class  Parent{
	public void cry() {
		System.out.println("Parent is crying");
		}
}
class Child1 extends Parent{
	public void cry() {
		System.out.println("Child1 is crying");
		}
}

class Child2 extends Parent{
	public void cry() {
		System.out.println("Child2 is crying");
		}
}



public class MethodOverriddingTruePolymor {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		Child2 c2= new Child2();
		c1.cry();
		c2.cry();
	}

}
