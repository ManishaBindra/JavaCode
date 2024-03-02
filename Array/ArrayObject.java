package Array;

import java.util.Scanner;

class Fan {
	int noOfWings;
	int cost;
}
public class ArrayObject {
//
	public static void main(String[] args) {
		Fan[] f=new Fan[3];
		f[0] = new Fan();
		f[1] = new Fan();
		f[2] = new Fan();
		
		f[0].cost=100;
		f[0].noOfWings=2;
		
		f[0].cost=300;
		f[0].noOfWings=4;
		
		f[0].cost=600;
		f[0].noOfWings=6;
		
		for(int i=0;i<f.length;i++) {
		System.out.println(" Detai of  Fan " + f[i]);
		}
	  System.out.println(" ");	
	}
	
}