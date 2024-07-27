package Inheritance;

class Person11{
	String name = "Manisha";
	int age = 24;
	
	void disp() {
		System.out.println("Name and age of Person1 is " + name + " " +age );
	}
}

class Person12 extends Person11{
	
}


class Person13 extends Person11{
	
}

class Person14 extends Person12{
	
}


public class HierarchyInherit {

	public static void main(String[] args) {
		Person13 d = new Person13();
		d.disp();

	}

}
