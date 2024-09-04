package ExceptionHandling;

public class ExceptionHandleChecked3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
// not sure what is threading rn but acco to below code application is sleeping for 4Secons
		//and we are sure that nothing gonna happen in 4 sec so let's handle 
	//we handled it throwing ducking the exception	
		System.out.println("Before Sleep");
		Thread.sleep(4000);
		System.out.println("After Sleep");
	}

}


//Is ducking exception means handling = No