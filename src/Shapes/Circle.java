package Shapes;

import java.util.Scanner;

public class Circle implements Shape {
    double pi = 3.14159265358979323846;

    @Override
    public void draw() {
        System.out.println("Inside Circle:: draw() method");
    }

    private void calculateCircumferenceWithRadius() {
        // Ask for Radius
        System.out.print("Enter Radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        // Compute and display Circumference
        double Circumference = 2 * pi * radius;
        System.out.print("Area =  " + Circumference);
    }

    private void calculateCircumferenceWithDiameter() {
        // Ask for Diameter
        System.out.print("Enter Diameter: ");
        Scanner input = new Scanner(System.in);
        double diameter = input.nextDouble();
        double radius = diameter / 2;

        // Compute and display Circumference
        double Circumference = 2 * pi * radius;
        System.out.print("Area =  " + Circumference);

    }

    private void calculateAreaWithRadius() {
        // Ask for Radius
        System.out.print("Enter Radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        // Compute and display Area
        double area = pi * (radius * radius);
        System.out.print("Area =  " + area);
    }

    private void calculateAreaWithDiameter() {
        // Ask for Diameter
        System.out.print("Enter Diameter: ");
        Scanner input = new Scanner(System.in);
        double diameter = input.nextDouble();
        double radius = diameter / 2;

        // Compute and display Area
        double area = pi * (radius * radius);
        System.out.print("Area =  " + area);
    }

    public void askOperation() {
        {
            System.out.println("1. Calculate Circumference with Radius");
            System.out.println("2. Calculate Circumference with Diameter");
            System.out.println("3. Calculate Area with Radius");
            System.out.println("4. Calculate Area with Diameter");
            System.out.print("Option: ");

            // get user input
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    calculateCircumferenceWithRadius();
                    break;
                case 2:
                    calculateCircumferenceWithDiameter();
                    break;
                case 3:
                    calculateAreaWithRadius();
                    break;
                case 4:
                    calculateAreaWithDiameter();
                default:
                    break;
            }
        }
    }
}
