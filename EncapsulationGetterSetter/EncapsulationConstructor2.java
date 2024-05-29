package EncapsulationGetterSetter;

//Constructor Overloading happening - refers to the process of having multiple constructor in a class with different parameters
class Student2{
	
	private int age;
	private String name;
	private String city;
	
	//constructor1
	 public Student2(String name, int age, String City){
//Super method if you write or not it'll automatically call from backend - it is used to call parent class constructor which is nothing default  constructor. 
//if there is this() there then super() method will not call
//super();
//this method will call the same class constructor as there is zero parameter then it'll call 2nd constructor whereas Super() used to call parent class constructor.		 
		 this();
//Stack overflow - as inside below this() method is again this() method is calling 
		 //this("Mahi" , 20 , "Chandigarh");
		 this.name = name ;
		this.age= age;
		this.city = city;
	 }
	 //constructor 2
	 Student2(){
		 this("Nitin");
		 age = 20;
		 city = "Shimla";
	 }
	//constructor 3
		 Student2(String name){
			 this.name = name;
		 
		 } 
	 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
public class EncapsulationConstructor2 {

	public static void main(String[] args) {
//Calling the constructor IK we haven't created any constructor JVM will create default constructor in the backend	
		//Student2 std2 = new Student2();
//we need parameters that's why we have created constructor 
		Student2 std2 = new Student2("Manu" , 20, "CHD");
		System.out.println(std2.getAge());
		System.out.println(std2.getName());
		System.out.println(std2.getCity());
	
		Student2 std3 = new Student2();
		System.out.println(std3.getAge());
		System.out.println(std3.getName());
		System.out.println(std3.getCity());
		
		Student2 std4 = new Student2();
		System.out.println(std4.getName());
		
		
	}

}
