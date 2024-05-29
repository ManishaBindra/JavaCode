package StaticKeyword;

public class StaticBasic2 {

	static int a ;
	static int b;
	
	static {
		System.out.println("Static Block");
		a=10;
		b=40;
	}
	
	static void disp() {
		System.out.println("Static Method");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		//here we haven't created any obj because this method is exist in the same class
		disp();

	}

}
