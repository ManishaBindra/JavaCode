package WrapperClass;

public class WrapperClass2 {

	public static void main(String[] args) {
		 Boolean b1 = new Boolean("yes"); // false
		 Boolean b2 = new Boolean("no"); // false	
		 
		 System.out.println(b1);
		 System.out.println(b2);

		 System.out.println(b1.equals(b2)); //false.equals false = true
		 System.out.println(b1=b2); //obj compare alays false 
		 
	}

}
