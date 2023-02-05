package Shapes;
import java.util.Scanner;

public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside  Rectangle::draw() method.");
    }
    public double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }
    private void askForInput(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();
        
        System.out.println("Area = " + calculateArea(length, width));
    }
    public void showArea(){
        this.askForInput();
    }
}