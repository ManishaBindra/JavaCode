package MultipleThreading;

//1 program
//extend Thread
//make method with name run
//if sleep is there thee should be IntruptedException

class Hi extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try{
				Thread.sleep(1000);
			}
		
			catch(Exception e) {
			}
		}
	}
}
class Hello extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
		}	
	}
}
}

public class Thread12 {

	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
		obj2.start();
		
		//obj1.show();
		//obj2.show();

	}
}


