package ExceptionHandling;

class Demo{
	int disp() {
		try {
			System.out.println("Method started");
		return 10;
		}
		finally{
		System.out.println("Method ending");
	
	}
}
}
public class ExceptionHandle5 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.disp();
	}
	}

