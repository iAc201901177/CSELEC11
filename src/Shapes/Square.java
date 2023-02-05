package Shapes;
import java.util.Scanner;

public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
    public double calculateArea(double side){
        double area = side * side;
        return area;
    }
    private void askForInput(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Side's length: ");
        double side = input.nextDouble();
        System.out.println("Area = " + calculateArea(side));
    }
    public void showArea(){
        this.askForInput();
    }
}
