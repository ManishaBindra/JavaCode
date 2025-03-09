package MultipleThreading;

class Demo111 extends Thread{
	public void run() {
		for(int i =1;i<5;i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
		}
	}
}
}
public class Thread6 {

	public static void main(String[] args) throws InterruptedException {
		Demo111 t = new Demo111();
		t.start();
		//t.join();
		t.join(100,10);
		for(int i =1;i<5;i++) {
			System.out.println("Rama Thread");

		}

	}

}
