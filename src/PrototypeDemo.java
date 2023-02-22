import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Shape Type: ");
        String type = br.readLine();

        if (type.equalsIgnoreCase("circle")) {
            System.out.print("Enter Circumference: ");
        } else {
            System.out.print("Enter Perimeter: ");
        }
        double perimeter = Double.parseDouble(br.readLine());

        System.out.print("Enter" + type + "Area: ");
        double area = Double.parseDouble(br.readLine());

        Shape sp1 = new Shape(type, perimeter, area);
        sp1.showAll();
    }
}
