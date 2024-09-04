package CalculateAreaProject;

import java.util.Scanner;
//1
class Reactangle {

	public float length;
	public float breadth;
	public float area;
	
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
	
	public void display() {
		System.out.println("Area of Reactangle" + area);
	
	}
}

	//2
	class Circle {

		public float radius;
		final double pii = 3.14;
		public double area;
		
		public void input() {
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter the radius of circle");
			radius= scan.nextFloat();
			
		}
		
		public void compute() {
		area = pii * radius * radius;	
		}
		
		public void display() {
			System.out.println("Area of Circle" + area);
		
		}
	}
	
	//3
		class Square {

			public float length;
			
			public double area;
			
			public void input() {
				Scanner scan = new Scanner(System.in);
				System.out.println("please enter the length of square");
				length= scan.nextFloat();
				
			}
			
			public void compute() {
			area = length * length;	
			}
			
			public void display() {
				System.out.println("Area of sqaure " + area);
			
			}
		}
		
	
	public class CalculateArea{
		public static void main(String [] args) {
		Reactangle r = new Reactangle();
		Circle c = new Circle();
		Square s= new Square();
		
		r.input();
		r.compute();
		r.display();
		
		c.input();
		c.compute();
		c.display();
		
		s.input();
		s.compute();
		s.display();
		
	 
	
	}}
	

	
