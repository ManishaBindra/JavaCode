package MultipleThreading;

//For Thread we need to give start and run and in method we can use Run and in obj calling we can use start 

class Demo1 extends Thread{
	public void run() {
		
		for(int i=0;i<50;i++) {
			System.out.println("Hi");
			try {
				
				Thread.sleep(200);
			}
			catch(Exception e) {
		System.out.println("Unhandled");
	}
			
}
}
}
class Demo2 extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("Hello");
		}
	}
}


public class Thread2 {

	public static void main(String[] args) {
		Demo1 obj1 = new Demo1();
		Demo2 obj2 = new Demo2();
		try {
			System.out.println(obj2.getPriority());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//obj2.setPriority(2);
		//System.out.println(obj2.getPriority());
		obj1.start();
		//obj2.sleep(100, 5000);
		obj2.start();
		
	}

}

	


