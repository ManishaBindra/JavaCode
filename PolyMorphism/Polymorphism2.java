package PolyMorphism;

class Airport{
	public void fly() {
		System.out.println("Parent is flying");
	}
}

class Indigo extends Airport{
	public void fly() {
		System.out.println("Indigo is flying");
	}
}
	class AirIndia extends Airport{
		public void fly() {
			System.out.println("AirIndia is flying");
		}
		public void worldWideFly() {
			System.out.println("AirIndia is flying WorldWide");
	
		}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		Airport apI = new Indigo();
		apI.fly();
		Airport apA = new AirIndia();
		apA.fly();
		//apA.worldWideFly it is throwing error cause it is special method and i doesn't exist in Parent class
		((AirIndia) apA).worldWideFly();
	}

}

