package Shapes;

import java.util.Scanner;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside  Rectangle::draw() method.");
    }

    private void calculatePerimeter() {
        // Ask for Length and Width
        System.out.print("Enter Length: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.print("Enter Width: ");
        double width = input.nextDouble();

        // Compute and display Perimeter
        double perimeter = 2 * (length * width);
        System.out.print("Perimeter = " + perimeter);
    }

    private void calculateArea() {
        // Ask for Length and Width
        System.out.print("Enter Length: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.print("Enter Width: ");
        double width = input.nextDouble();

        // Compute and display Area
        double area = length * width;
        System.out.print("Area = " + area);
    }

    public void askOperation() {
        System.out.println("1. Calculate Perimeter");
        System.out.println("2. Calculate Area");
        System.out.print("Option: ");

        // get user input
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                calculatePerimeter();
                break;
            case 2:
                calculateArea();
                break;
            default:
                break;
        }
    }
}