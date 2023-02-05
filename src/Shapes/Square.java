package Shapes;

import java.util.Scanner;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    private void calculatePerimeter() {
        // Ask for Length
        System.out.print("Enter Length: ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();

        // Compute and display Perimeter
        double perimeter = 4 * side;
        System.out.print("Perimeter = " + perimeter);
    }

    private void calculateArea() {
        System.out.print("Enter Length: ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();

        // Compute and display Area
        double area = side * side;
        System.out.print("Area = " + area);
    }

    public void askOperation() {
        System.out.println("1. Calculate Perimeter");
        System.out.println("2. Calculate Area");
        System.out.print("Option: ");

        // get user input
        Scanner inputInt = new Scanner(System.in);
        int choice = inputInt.nextInt();
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
