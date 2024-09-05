package WrapperClass;

public class WrapperClass1 {

	public static void main(String[] args) {
		
		//below is constructor
		
		Integer i1 = new Integer(10);
		System.out.println(i1); //toString()
		
		Integer i2 = new Integer("10");
		System.out.println(i2);  //toString()
		
		
		Character c1 = new Character('a');
		System.out.println(c1);  //toString()

		Float f1 = new Float(10.5f);
		System.out.println(f1);
		
		Float f2 = new Float("10.5f");
		System.out.println(f2);
		
		Float f3 = new Float("10.5");
		System.out.println(f3);
		
		Float f4 = new Float(10.5);
		System.out.println(f4);
		
		//Character c2 = new Character("a");
		//System.out.println(c2);  //toString()
		
		Boolean b1 = new Boolean(true);
		System.out.println(b1);
		
		
		Boolean b2 = new Boolean(false);
		System.out.println(b2);
		
		Boolean b3 = new Boolean("true");
		System.out.println(b2);
		
		Boolean b4 = new Boolean("false");
		System.out.println(b4);
		
		
		Boolean b5 = new Boolean("Manisha");
		System.out.println(b5);
		
		Integer i3 = new Integer("TEN ");
		System.out.println(i3);  //toString()
		
		
		
		
		

	}

}
