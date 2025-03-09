package MultipleThreading;

//2 program
//Implements Runnable Interface 
//Runnable Interface id FunctionalInterface
//Functional is having Lambda 
//start method doesn't exist in Runnable 
//lambda we don't need to use run method anymore



public class Thread13 {

	public static void main(String[] args) {
		 
		Thread  t1= new Thread (() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hi");
				try{
				Thread.sleep(1000);
				}
		
				catch(Exception e) {
				}
			}
	}
);
		Thread  t2= new Thread (() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				}
					catch(Exception e) {
					}	
			}
		}
	);		
		
		t1.start();
		t2.start();

	}
}


