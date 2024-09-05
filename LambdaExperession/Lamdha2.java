package LambdaExperession;

//@FunctionalInterface
interface Demo1{
	void disp();
	void add(int a, int b);
}
//Lambda expression with Anonymous class
public class Lamdha2 {

	public static void main(String[] args) {
		Demo1 d = new Demo1() {
			public void disp() {
				System.out.println("Hello");
			}
			public void add(int a, int b) {
				int c= a+b;
				System.out.println(c);
				}
		};
		d.disp();
		d.add(10, 20);
	}

}
