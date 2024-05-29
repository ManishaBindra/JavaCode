package EncapsulationGetterSetter;

 class Dog1{
	private String name;
	private int cost;
	
//constructor 1	with this() method
	public Dog1(){
	this("sheru", 1050)	;
	}
	
//constructor 2	with this keyword so stack overflow gonna happen	
	public Dog1(String name, int cost) {
		this.name= name;
		this.cost=cost;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
}




public class StackOverflowConstructor {

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		System.out.println("Name of First born dog " + d1.getName());
		System.out.println("Cost of First born dog " +d1.getCost());

		Dog1 d2 = new Dog1("Raha" , 2020);
		System.out.println("Name of second born dog " + d2.getName());
		System.out.println("Cost of second born dog " +d2.getCost());

	}

}
