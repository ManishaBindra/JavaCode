package MultipleThreading;

//InterruptedException
class MyThread1 extends Thread{
	@Override
	public void run() {
		try {
			for (int i=0;i<5;i++) {
				System.out.println("I am a sleeping Thread : " +i);
				//Thread.sleep(3000);
			}
		}
		
		//2nd case no sleeping so No intrrupted
		catch(Exception e) {
			System.out.println("Got Interrupted");

		}
	}
}

public class Thread8 {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
		
		t.interrupt(); //main thread intruppting child thread
		System.out.println("End of Main Thread going not to dead state as there is iNTRUPPTED by main to child");

	}

}
