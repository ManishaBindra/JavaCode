package MultipleThreading;

class Child
{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class Thread1 {

	public static void main(String[] args) {
		Child c = new Child();
		
		for(int i=1;i<10;i++) {
			System.out.println("Main Thread");

		}
	}

}
