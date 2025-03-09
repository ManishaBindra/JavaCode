package MultipleThreading;

//InterruptedException
class MyThread extends Thread{
	@Override
	public void run() {
		try {
			for (int i=0;i<5;i++) {
				System.out.println("I am a sleeping Thread : " +i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e) { 
			System.out.println("Got Interrupted");

		}
	}
}

public class Thread7 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		t.interrupt(); //main thread intruppting child thread
		System.out.println("End of Main Thread going not to dead state as there is iNTRUPPTED by main to child");

	}

}
