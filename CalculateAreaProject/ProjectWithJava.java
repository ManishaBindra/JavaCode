package CalculateAreaProject;

import java.util.Scanner;

abstract class Same{
	public double area;
	abstract public void input();
	abstract public void compute();
	public void display() {
		System.out.println("Area is  " + area);
	}
}
//1
class Reactangle1 extends Same {

	public float length;
	public float breadth;
	
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the length of Reactangle");
		length= scan.nextFloat();
		System.out.println("please enter the breadth of Reactangle");
		breadth= scan.nextFloat();
	}
	
	public void compute() {
	area = length * breadth;	
	}
	
	
}

	//2
	class Circle1 extends Same {

		public float radius;
		final double pii = 3.14;
		
		
		public void input() {
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter the radius of circle");
			radius= scan.nextFloat();
			
		}
		
		public void compute() {
		area = pii * radius * radius;	
		}
		
	}
	
	//3
		class Square1 extends Same{

			public float length;
			
			
			public void input() {
				Scanner scan = new Scanner(System.in);
				System.out.println("please enter the length of square");
				length= scan.nextFloat();
				
			}
			
			public void compute() {
			area = length * length;	
			}
			
			
		}
		
		 class Calculate{
			void permit(Same s) {
			s.input();
			s.compute();
			s.display();
		}
		 }
		
public class ProjectWithJava {
	public static void main(String [] args) {
		Reactangle1 r = new Reactangle1();
		Circle1 c = new Circle1();
		Square1 ss= new Square1();
		
		Calculate cal = new Calculate();
		cal.permit(r);
		cal.permit(c);
		cal.permit(ss);
		
	}
}
		 
		
		
	 
	
