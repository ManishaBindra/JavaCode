package MultipleThreading;


//Program6

class Display4{
	public synchronized void displayNumbers() {
		for(int i=1;i<=10;i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
		}
		
		
	}
	
	public synchronized void displayCharacters() {
		for(int i=65;i<=75;i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
		}
		
		
	}
}

public class Thread17 extends Thread {

	public static void main(String[] args) {
		Display4 d; //has -a 
	//	Thread17(Display d){
		//	this.d = d;
			
		}

	}

//}
