package String;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String s1 = "A gentleman";				//"Keep";
		String s2 = "ElegantMan";						//"Peek";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");

		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		//Arrays.sort(ch2); did bubble sort instead of complete method
		
		for(int i=0;i<ch2.length;i++) {
			 for(int j=0;j<ch2.length-1;j++) {
				if(ch2[j]>ch2[j+1]) {
					char temp=ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=temp;
				}
			 }
		 }
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("It's Anagram");
		}
		else {
			System.out.println("It's not Anagram");
		}
		

	}

}
