package String;

public class StringBufferMutable {

	public static void main(String[] args) {
	  final StringBuffer sb = new StringBuffer("Sachin"); //Final keyword cannot change the nature of String Buffer
		sb.append("Tendulkar");
		System.out.println(sb);
		System.out.println(sb.length()); //no of characters stored
		System.out.println(sb.capacity());// how many no of charters can be stored
		
		StringBuffer sb1 = new StringBuffer("Rahul");
		sb1 = new StringBuffer("Virat");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println(sb2.length()); //0
		System.out.println(sb2.capacity());//100
		
		StringBuffer sb3 = new StringBuffer("Manisha");
		System.out.println(sb3.charAt(4));//s
		sb3.setCharAt(5, 'a');
		System.out.println(sb3);
		
//Append methods 
		StringBuffer sb4 = new StringBuffer("Students ");
		sb4.append(3.1414);
		sb4.append(" is the value of PII ");
		sb.append(true);
		System.out.println(sb4);
		
//Insert Method 		
		StringBuffer sb5 = new StringBuffer("Manisha Bindra");
		sb5.insert(7, "MB");
		sb5.insert(16, 1145069);
		System.out.println(sb5);
		sb5.insert(sb5.length(), "dhoni");
		System.out.println(sb5);
		
//Delete Method 
		StringBuffer sb6 = new StringBuffer("Manisha Bindra 1145069");
		sb6.delete(15, 22);
		System.out.println(sb6);
		sb6.deleteCharAt(0);
		System.out.println(sb6);
		
//reverse 
		StringBuffer sb7 = new StringBuffer("Shivani");
		sb7.reverse();
		System.out.println(sb7);

//SetLength 
		StringBuffer sb8 = new StringBuffer("SachinTendulkar");
		sb8.setLength(6);
		System.out.println(sb8);
		
//trimToSize
		StringBuffer sb9 = new StringBuffer(1000);
		System.out.println(sb9.capacity());
		sb9.append("Sachin");
		System.out.println(sb9.capacity());
		
		
		sb9.trimToSize();
		System.out.println(sb9.capacity());

//Method Chaining 
		StringBuffer sb10 = new StringBuffer("Virat");
		sb10.append("Kohli").insert(10, "Anushka").reverse().append("IND").insert(sb.length(),"RCB").reverse().delete(0,6);
		System.out.println(sb10);
	}

}
