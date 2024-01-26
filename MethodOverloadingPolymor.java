package Methods;

//example of run time polymorphism or True polymorphism 

class Calculator1
{
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
   float add(int a, float b, int c) {
		return a+b+c;
	}
   double add(int a, double b ) {
		return a+b;
	}
   double add(int a, double b, float c ) {
		return a+b+c;
	}
}

public class MethodOverloadingPolymor {

	public static void main(String[] args) {
		Calculator1 calc=new Calculator1();
		int a=10,b=20,c=30;
		float m=10.5f,n=20.5f,o=30.5f;
		double p=100.5,q=200.5,r=300.5;
		System.out.println(calc.add(a, b,c));
		System.out.println(calc.add(a,m,b));
		System.out.println(calc.add(a,p));
		System.out.println(calc.add(a,p,o));

	}

}
