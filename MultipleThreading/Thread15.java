package MultipleThreading;

//4 program
//Thread mname set



public class Thread15 {

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
	
		t1.setName("Hi Thread");
		t2.setName("Hello Thread");
		t1.setPriority(1); //1 is least
		t2.setPriority(10); //high
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		//t1 join hogya mtlb execute hogya ab alive hai ke nhi check krte
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");

	}
}


