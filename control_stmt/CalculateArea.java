package com.edu.constmt;

import java.util.Scanner;

class AreaFigures{
	double area;
	
	public void square(double side) { //method with return type and no argument
		area = side*side;
		System.out.println("Area of square "+area);
	}
	
	public double rectangle(double l, double b ) { //method with return type with argument
		area = l*b;
		return area;
	}

	public void triangle(double base, double height) {
		area = (base*height)/2;
		System.out.println("Area of Triangle : "+area);
		
	}

	public void circle(double radius) {		
		area = 3.14159f*radius*radius;
		System.out.println("Area of circle: "+area);
	}
	
}
public class CalculateArea {

	public static void main(String[] args) {
		double l,b;
		
		AreaFigures areaobj = new AreaFigures();
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU Area of Different Figures");
		
		System.out.println("Enter your choice");
		System.out.println("1.Reactangle");
		System.out.println("2.Area of Square");
		System.out.println("3.Area of Circle");
		System.out.println("4.Area of Triangle");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter side of square");
                double side=sc.nextDouble();
                areaobj.square(side);
		case 2: System.out.println("Enter length and breadth of Reactangle");
		        l=sc.nextDouble();
		        b=sc.nextDouble();
		        double arearect= areaobj.rectangle(l, b); //actual parameters
		        System.out.println("Area of Reactangle="+arearect);
		        break;
		case 3: //area of Circle
			     System.out.println("Enter radius");
			     double radius = sc.nextDouble();
			     areaobj.circle(radius);
			     break;
		case 4: //area of Triangle
			      System.out.println("Enter base and height of a triangle");
			      double base = sc.nextDouble();
			      double height = sc.nextDouble();
			      areaobj.triangle(base,height);
			      break;
	    default: System.out.println("Invalid input");
		}
	}
} 
