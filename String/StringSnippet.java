package String;

public class StringSnippet {
	
	public static void main(String[] args) {
				String s1=new String("you cannot change me!");
				String s2=new String("you cannot change me!");
				System.out.println(s1==s2);
				
				String s3="you cannot change me!";
				System.out.println(s1==s3);
				
				String s4="you cannot change me!";
				System.out.println(s3==s4);
				
				String s5="you cannot " + "change me!"; // Compiler : you cannot change me!
				System.out.println(s3==s5);
				
				String s6="you cannot ";
				String s7=s6+"change me!"; //JVM Include because of variable(Heap area)
				System.out.println(s3==s7);//false
				
				final String s8="you cannot "; //SCP
				String s9=s8+"change me!";// Final: as compiler involmement : you cannot chnge me!
				System.out.println(s3==s9);//true
				System.out.println(s6==s8);//true
				
	}

}
