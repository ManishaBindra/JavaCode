package Inheritance;

class Person1{
	String name = "Manisha";
	int age = 24;
	
	void disp() {
		System.out.println("Name and age of Person1 is " + name + " " +age );
	}
}

class Person2 extends Person1{
	
}

class Person3 extends Person2{
	
}
public class MultiLevelInherit {

	public static void main(String[] args) {
		Person3 d = new Person3();
		d.disp();

	}

}
