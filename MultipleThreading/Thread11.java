package MultipleThreading;
 
//Synchronization example 
class Display1{
	public synchronized  void wish(String name ) {
		for (int i=1;i<5; i++) {
			System.out.print(" Good Morning " );
			try {
				Thread.sleep(2000);	
			}
			catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}


class MyThread12 extends Thread{
	//HAS- A with Thread class 
	Display1 d;
	String name;
	
	//has-A relation aso make cONSTRUCtor
	MyThread12(Display1 d, String name){
		this.d = d;
		this.name= name;
	}
	public void run() {
		d.wish(name);
	}
}

public class Thread11 {

	public static void main(String[] args) {
		Display1 d = new Display1();
		Display1 d1 = new Display1();
		//made 2 Obj now how Syncho will react
		//Inconsistancy problem both the threds started
		MyThread12 t1 = new  MyThread12(d," Manisha");
		
		t1.start();
		MyThread12 t2 = new  MyThread12(d1," Shivani");
		t2.start();

	}

}
