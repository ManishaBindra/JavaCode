package String;

public class StringBasic {

	public static void main(String[] args) {
		String s1  = "Dhoni";
		System.out.println(s1);
		
		String s2  = new String ("Kholi");
		System.out.println(s2);
		
		System.out.println("  ");
		
		String s3  = "Dhoni";
		String s4 = s3.concat("Kholi");
		System.out.println(s4);
		
		System.out.println("  ");
		
		StringBuilder s5  = new StringBuilder("Virat");
		 s5.append("Kholi");
		System.out.println(s5);
		
		System.out.println("  ");
		
		String s6  = "Manisha";
		String s7 = new String ("Manisha");
		System.out.println(s6 ==s7);
		System.out.println(s6.equals(s7));//string class.equals method will compare the content of the object if same return true otherwise return false
		
		System.out.println("  ");
		
		StringBuilder s8  = new StringBuilder("Sachin");
		StringBuilder s9  = new StringBuilder("Sachin");
		System.out.println(s8 ==s9);
		System.out.println(s8.equals(s9));
		
	}

}
