package com.cognizant.shapes;

class Areacalculetor{
	void CalculateArea() {
		System.out.println("The Area of the rectangle is calculated using the formula length*breadth");
	}
}

 class Rectangle{
	 public static void main(String[]args) {
		 Areacalculetor sc=new  Areacalculetor();
		 sc.CalculateArea();
	 }
 }