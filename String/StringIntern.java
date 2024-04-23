package String;

public class StringIntern {

	public static void main(String[] args) {
		String s1= new String("sachin");
		String s2 = s1.intern();
		System.out.println(s1 == s2);
		
		String s3 = "sachin";
		System.out.println(s2 == s3);
		
		System.out.println(" ");
		
		
//---------------------------------
		
		String  s4 = new String("sachin");
		String s5 = s4.concat("tendulkar");
		String s6 = s5.intern();
		String s7 = "sachintendulkar";
		System.out.println(s6 == s7);
		
	}

}
