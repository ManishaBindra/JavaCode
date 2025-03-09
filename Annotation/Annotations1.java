package Annotation;

//Functional Interface which contains only 1 method . Functional interface also called Lambda

@FunctionalInterface
interface Trail{
	int getNum();
	//void disp();
}

class JavaLearning{
	public void disp1() {
		System.out.println("Parent Display");
	}
}

class Focus extends JavaLearning{
	@Override
	public void disp1() {
		System.out.println("Focus is the key");
	}
}

public class Annotations1 {

	public static void main(String[] args) {
		
		Trail t = () ->
		{
			int num= 10;
			return num;
		};
		
		Focus jl = new Focus();
		jl.disp1();
		
	}

}
