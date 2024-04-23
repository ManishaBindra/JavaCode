package String;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = new String("Sachin");
		//System.out.println(s1[3]);//CE
		System.out.println(s1.charAt(3));//h
		//System.out.println(s1.charAt(-1));//StringIndexOutOf Bound Exception
		//System.out.println(s1.charAt(20));	//StringIndexOutOf Bound Exception
		
		System.out.println(s1.length());//method in string class = 6
		
		int arr[] = {10,20,30};
		System.out.println(arr.length);//property on variable = 3
	
	//Equals method 
		System.out.println(s1.equals("Sachin"));
		System.out.println(s1.equals("SACHIN"));
		System.out.println(s1.equalsIgnoreCase("Sachin"));
	
	//Concept of Substring
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(3,6));
		
	//Replacement of String 	
		System.out.println(s1.replace('c', 'h'));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//Trim 
		String s2 = "  HyderAbbas  ";
		System.out.println(s2);
		System.out.println(s2.trim());
		
		System.out.println(s2.indexOf('A'));
		System.out.println(s2.indexOf('a'));
		System.out.println(s2.indexOf('b'));
		System.out.println(s2.lastIndexOf('a'));
		System.out.println(s2.indexOf('z'));
		System.out.println(s2.indexOf('x'));
		
	}

}
