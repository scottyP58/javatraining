package HelloWorld;

import java.util.Scanner;

abstract class Shape {

	abstract void calc(double radius, double pie); 
	
	//non abstract method
	public void run()
	{
		
		System.out.println("Shapes has run!");
		
	}
	
}

class Circle extends Shape {
	
	public void calc(double radius, double pie)
	{
		
		System.out.println("The circumference of circle is: " + ((radius * 2) * pie));
	}
	
	
}


class Shapes{
	
	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    double phi = Math.PI;
		    Scanner s = new Scanner(System.in);
		    System.out.println("Enter the radius of a circle: ");
		    double rad = s.nextDouble();
		    Circle cir1 = new Circle();
		    cir1.run();
		    cir1.calc(rad, phi);
		}
	
}
