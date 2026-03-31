// Write a circle class that has the following fields:
// radius: a double
// PI: a final double initialized with the value 3.14159
// The class should have the following methods:
// Constructor: Accepts the radius of the circle as an argument.
// Constructor: A no-arg constructor that sets the radius field to 0.0.
// setRadius: A mutator method for the radius field.
// getRadius: A accessor method for the radius field.
// getArea: Returns the area of the circle, which is calculated as area = PI * radius * radius.
// getDiameter: Returns the diameter of the circle, which is calculated as diameter = 2 * radius.
// getCircumference: Returns the circumference of the circle, which is calculated as circumference = 2 * PI * radius.

// Write a program that demonstrates the Circle class by asking the user for the circle's radius, creating a Circle object, and then reporting the circle's area, diameter, and circumference.

import java.util.Scanner;

public class CicleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Circle with radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Circumference: " + circle.getCircumference());

        input.close();
    }
}

class Circle {
    private double radius;
    private final double PI = 3.14159;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}