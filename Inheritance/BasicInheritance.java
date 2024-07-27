package Inheritance;

//IS-A relation is comes under Inheritance


///existing/base/super/parent class
class Demo1{
	String name = " Manisha";
	int age = 24;
	
	void disp() {
		System.out.println("Name and age of Demo1 is " + name + " " + age);
	}
}

//derived/sub/child class
class Demo2 extends Demo1{
	
}



public class BasicInheritance {

	public static void main(String[] args) {
		Demo2 d = new Demo2();
//here we know this method disp is exist in demo1 class so we are going to extend that class demo2 
		d.disp();
	
	}

}
