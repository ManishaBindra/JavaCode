package hasARelation;

public class Student {
// instance variable
	public String name;
	public Integer id;
	public Integer age;
	
	
	//generating Construcctor to set a value
	public Student(String name, Integer id, Integer age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}



	//setting the value 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	}



