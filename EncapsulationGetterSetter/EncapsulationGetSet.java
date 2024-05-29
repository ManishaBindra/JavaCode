package EncapsulationGetterSetter;

class Student{
	
	private int age;
	private String name;
	private String city;
	private boolean married;
	
	//Right click go to source and choose getter and Setter 
	
	//void setAge(int a){
		//age=a;  
		//if we want to give same local variable name then there will be a problem occurs that is shadowing Problem . To resolve this issue we have "This" keyword
	void setAge(int age) {
		this.age= age;
	}
	// this method is used to return value or agr ye dusri class me use karni hoti toh bhi hm getter method use krte hai
	int getAge(){ 
		return age;
	}
	
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
	
	void setCity(String city){
		this.city=city;
	}
	String getCity(){
		return city;
	}
	
	//In boolean case in getter method we cannot use get intead of get we use IS
	public boolean isMarried() {
		return married;
	}
}


public class EncapsulationGetSet {

	public static void main(String[] args) {
		
		Student st = new Student();
		//st.age = 30; st.city = ""; agr vo private na hote toh ye kam karta
		st.setAge(30);
		int age = st.getAge();
		System.out.println("Age of Student is " + age);
		
		st.setName("Manisha");
		String name = st.getName();
		System.out.println("Name of Student is " + name);
		
		st.setCity("Chandigarh");
		String city = st.getCity();
		System.out.println("City of Student is " + city);

		//create another object for the same class
		Student st2 = new Student();
		st2.setAge(50);
		System.out.println(st2.getAge());

		
	}

}
