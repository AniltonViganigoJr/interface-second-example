package application;

import model.entities.Circle;
import model.entities.Reactangle;
import model.entities.Shape;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {

	Shape retangle = new Reactangle(Color.BLACK, 5.00, 5.00);
	Shape circle = new Circle(Color.RED, 10.00);
	
	System.out.println("***** CIRCLE *****");
	System.out.println("Color: " + circle.getColor());
	System.out.println("Area: " + String.format("%.2f", circle.area()));
	System.out.println("\n***** RECTANGLE *****");
	System.out.println("Color: " + retangle.getColor());
	System.out.println("Area: " + String.format("%.2f", retangle.area()));
	}
}