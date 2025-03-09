package MultipleThreading;


class Demo11 extends Thread{
	public void start() {
		super.start();
		System.out.println("Thread Started");
		
	}
	@Override
	public void run() {
		System.out.println("No args in run method");
		//run(5);
	}
	public void run(int i) {
		//super.start();
		System.out.println("args in run method");
	}
}

public class Thread3 {

	public static void main(String[] args) {
		Demo11 d = new Demo11();
		d.start();
		d.run();
		d.run(5);
		
		//tsk for main thread 
		
			System.out.println("Mainmethod");	
			
		

	}

}
