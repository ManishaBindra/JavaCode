package WrapperClass;

public class PrimitiveToWrapper {

	public static void main(String[] args) {
		Integer i = new Integer(130);
		 System.out.println(i.byteValue()); //-126
		 System.out.println(i.shortValue()); //130
		 System.out.println(i.intValue());
		 System.out.println(i.longValue());
		 System.out.println(i.floatValue()); //130.0
		 System.out.println();
		 
		 
		 Character c = new Character('a');
		 char c1 = c.charValue();
		 System.out.println(c1);
		 
		 Boolean b1 = new Boolean("false");
		 boolean b2 = b1.booleanValue();	
		 System.out.println(b2);
	}

}
