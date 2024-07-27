package Inheritance;

class Plane{
	public void fly() {
	System.out.println("Parent plane is flying ");
	}
	public void land() {
		System.out.println("Parent plane is landing ");
		}
	public void takeOff() {
		System.out.println("Parent plane is taking off ");
		}
	
}
class CargoPlane extends Plane{
	public void fly() {
		System.out.println("CargoPlane that is child plane is flying ");
		}
	public void carryWood() {
		System.out.println("carryWood that is child  plane is flying ");
		}
}
class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("PassengerPlane that is child plane is flying ");
		}
	public void carryPassenger() {
		System.out.println("carryPassenger that is child plane is flying ");
		}
}
public class LaunchInheritanceUML {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();

		cp.fly();
		cp.land();
		cp.takeOff();
		cp.carryWood();
		
		pp.fly();
		pp.land();
		pp.takeOff();
		pp.carryPassenger();
		
	}

}
