package PolyMorphism;


class Parent11{
	public void PMethod(){
	System.out.println("Parent class is calling");
}
}
class Child extends Parent11{
	public void PMethod(){
		System.out.println("Child class is calling");
	}
}
class Child22 extends Parent11{
	public void PMethod(){
		System.out.println("Child2 class is calling");
	}
}

//Polymorpghism concept 

class Poly{
	public void resolveOneToMany(Parent11 parent11) {
		parent11.PMethod();
	}
}



public class PolyMorLooseCoupling {

	public static void main(String[] args) {
		Parent11 c1 = new  Child();
		Parent11 c2 = new  Child22();
		
//		Parent11 parentobj;
//		
//		parentobj = c1;
//		parentobj.PMethod(); //1:M
//		
//		parentobj=c2;
//		parentobj.PMethod();//1:M
//			//here we have 1:M which is not polymorphism as polymorphism means code resuablity we don't need to write the code again to resolve this issue I'll make one more class 

		
		//below is true polymorphism as everything will run as run time polymor
		
		Poly a = new Poly();
		a.resolveOneToMany(c1);
		a.resolveOneToMany(c2);
		
	}

}
