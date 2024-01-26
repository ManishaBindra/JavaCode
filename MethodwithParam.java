package Methods;

class Calculators{
	int a,b,sum;
	void add(int a, int b) {
		sum = a+b;
		System.out.print("Sum of two numbers = " + sum);
	}
}

public class MethodwithParam {

	public static void main(String[] args) {
		Calculators calc = new Calculators();
		calc.add(50, 80);
				

	}

}
