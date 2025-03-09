package MultipleThreading;
//This is another way to create Thread 
//why we use this one is if we want to extend any other class we will not 
//able to do that becoz in Java multiple inheritance is not possible
class A implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
		}
	}
}

class B implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
	}
}

public class Thread4 {

	public static void main(String[] args) {
		
		//A obj1 = new A();
		//B obj2 = new B ();
		//instead oF A use Runnable
		Runnable obj1 = new A();
		Runnable obj2 = new B();
		//we can't use Stsrt method now because in Runnable start doesn't exyist
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}

}
