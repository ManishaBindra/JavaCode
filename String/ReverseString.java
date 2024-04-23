package String;

public class ReverseString {

	public static void main(String[] args) {

//Sachin ---> nihcaS
		String s1 = "Sachin";
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--) {
			 s2= s2+s1.charAt(i);
		}
		System.out.println("First String is  " +s1);
		System.out.println("Reverse of first String is  " +s2);

		
//Sachin Java --> avaJ nihcaS (
		String s3 = "Sachin Java";
		String s4="";
		
		String sarr[] = s3.split(" ");//divide kiya aaray ki form mai
		for(String elem : sarr) {
			for(int i=elem.length()-1;i>=0;i--) {
				s4=s4+elem.charAt(i);//nihcaS
			}
			s4 = s4+" ";		
		}
		System.out.println("First String is  " +s3);
		System.out.println("Reverse of String is  " +s4);

	}

}
