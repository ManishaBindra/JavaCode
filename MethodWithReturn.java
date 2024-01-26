package Methods;

class Calculatorss{
 int a, b, sum;
 int add() {
	 int a= 10; 
	 int b=30;
	 sum = a+b;
	 return(sum);
	 
 }
}
public class MethodWithReturn {

	public static void main(String[] args) {
	Calculatorss calc = new Calculatorss();
	int res = calc.add();
	System.out.print("sum of two numbers = " +res);

	}

}
