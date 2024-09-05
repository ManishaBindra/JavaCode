package LambdaExperession;

@FunctionalInterface
interface Demo{
	void disp();
}

class Trial implements Demo{
	public void disp() {
		System.out.println("Lambda Approach");	
	}
}

public class Lambda {

	public static void main(String[] args) {
		Demo d = () -> {
			System.out.println("Lambda Approach");	
		};

		d.disp();
		
	}

}
