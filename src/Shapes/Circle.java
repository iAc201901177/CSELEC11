package Shapes;
import java.util.Scanner;

public class Circle implements Shape {
    double pi = 3.14159265358979323846;
    @Override
    public void draw(){
        System.out.println("Inside Circle:: draw() method");
    }
    public double calculateAreaWRadius(double radius){
        double area = pi * (radius * radius);
        return area;
    }
    public double calculateAreaWDiameter(double diameter){
        double radius = diameter / 2;
        double area = pi * (radius * radius);
        return area;
    }
    private void askForAvailable(){
        //ask for what's known
        System.out.println("1. Calculate with Radius");
        System.out.println("2. Calculate with Diameter");
        System.out.print("Option: ");

        //get user input
        Scanner inputInt = new Scanner(System.in);
        int choice = inputInt.nextInt();
        if(choice == 1){System.out.print("Enter Radius: ");}
        else{System.out.print("Enter Diameter: ");}
        
        double variable = inputInt.nextDouble();
        
        //actual display
        System.out.print("Area = ");
        if(choice == 1){System.out.print(calculateAreaWRadius(variable));}
        else{System.out.print(calculateAreaWDiameter(variable));}
    }
    public void showArea(){
        this.askForAvailable();
    }
}
