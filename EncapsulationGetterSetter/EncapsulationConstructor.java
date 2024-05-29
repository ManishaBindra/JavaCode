package EncapsulationGetterSetter;

class Student1{
	
	private int age;
	private String name;
	private String city;

//Replaced setter with constructor - constructor which is having same method name as class name .	
	public Student1(int age, String name , String city) {
		this.age=age;
		this.city=city;
		this.name=name;
	}
	public int getAge(){
		return age;
		}
	public String getCity(){
		return city;
		}
	public String getName(){
		return name;	
		}
	}

public class EncapsulationConstructor {

	public static void main(String[] args) {
		//parameterised Constructor
		Student1 std1 = new Student1(20, "Goa", "Mahi");
		System.out.println(std1.getAge());
		System.out.println(std1.getName());
		System.out.println(std1.getCity());
	}

}
