package String;

public class StringPalindrome {

	public static void main(String[] args) {
		String s1 = "NITIN";
		String s2 = "" ;
		
//Traveling in reverse and putting data in s2		
		for (int i=s1.length()-1;i>=0;i--) {
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
		
		if(s1.equals(s2)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
	    }
	}

}
