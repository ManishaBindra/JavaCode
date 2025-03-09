package MultipleThreading;
//let's make one more class and go for has-A relation 
class Display{
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


class MyThread11 extends Thread{
	//HAS- A with Thread class 
	Display d;
	String name;
	
	//has-A relation aso make cONSTRUCtor
	MyThread11(Display d, String name){
		this.d = d;
		this.name= name;
	}
	public void run() {
		d.wish(name);
	}
}

public class Thread10 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread11 t1 = new  MyThread11(d," Manisha");
		t1.start();
		MyThread11 t2 = new  MyThread11(d," Shivani");
		t2.start();

	}

}
