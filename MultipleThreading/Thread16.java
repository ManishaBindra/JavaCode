package MultipleThreading;


//Program 5 
//Synchronization == means only one thread can work with method

class Counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class Thread16 {

	public static void main(String[] args) throws InterruptedException {
	Counter c = new Counter();
	
	Thread t1 = new Thread(new Runnable() {
		public void run() {
			for(int i=1;i<=10000;i++) {
				c.increment();
			}
		}
	});
	
	//making 2nd thread
	Thread t2 = new Thread(new Runnable() {
		public void run() {
			for(int i=1;i<=10000;i++) {
				c.increment();
			}
		}
	});
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	System.out.println("Count is " + c.count); //got 19968

	}

}
