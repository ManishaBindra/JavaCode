package PolyMorphism;
class  Parent2{
	public void cry() {
		System.out.println("Parent2 is crying");
		}
}
class Child3 extends Parent2{
	public void cry() {
		System.out.println("Child3 is crying");
		}
}

class Child4 extends Parent2{
	public void cry() {
		System.out.println("Child4 is crying");
		}
}



public class MethodOverloading {

	public static void main(String[] args) {
		Child3 c3=new Child3();//tight coupling
		//Parent ineuron = new Child1();//loose coupling
		Child4 c4= new Child4();
		
		Parent2 ref;
		ref = c3;
		ref.cry(); //1:M 1line multiple work 30,34
		
		ref= c4;
		ref.cry();//polymor 1:M
//also called loose coupling 
		
		
	}

}