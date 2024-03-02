package Methods;

class Calculator
{
	int a,b,sum; //instance variable 
	void add() {
		int a=10,b=30;
		int sum = a+b;
		System.out.print("sum of two numbers = " + sum);
		
}


public class Method {

	public static void main(String[] args) {
	 Calculator calc = new Calculator();
	 calc.add();
      }

	}

}
