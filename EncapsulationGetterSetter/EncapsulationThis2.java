package EncapsulationGetterSetter;


class Dog{
	private String name;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
public class EncapsulationThis2 {

	public static void main(String[] args) {
	Dog d= new Dog();
	d.setName("Shera");
	System.out.println(d.getName());
	d.setCost(30000);
	int cost=d.getCost();
	System.out.println(cost);
	

	}

}
