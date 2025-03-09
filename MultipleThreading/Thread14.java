package MultipleThreading;

//3 program
//Thread join and ALIVE method
//join will wait to rest of the two methods to run



public class Thread14 {

	public static void main(String[] args) throws Exception {
		 
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
		
		t1.join();
		t2.join();
		
		//t1 join hogya mtlb execute hogya ab alive hai ke nhi check krte
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");

	}
}


