package MultipleThreading;


//3rd case after exceution of CHILD went for sleep 

class MyThread2 extends Thread{
	@Override
	public void run() {
		
			for (int i=0;i<5;i++) {
				System.out.println("I am a sleeping Thread : " +i);
				//Thread.sleep(3000);
			}
			System.out.println("Entering into sleeping state");
			try {
			Thread.sleep(3000);
			}
		
			catch(Exception e) {
			System.out.println("Got Interrupted");

		}
	}
}
public class Thread9 {

	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();
		
		t.interrupt(); //main thread intruppting child thread
		System.out.println("End of Main Thread going not to dead state as there is iNTRUPPTED by main to child");

	}


	}


