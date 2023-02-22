public class Shape implements Prototype {
    String type;
    double perimeter, area;

    public Shape() {
        System.out.println("This is a shape of Unknown origin or type");
    }

    public Shape(String type, double perimeter, double area) {
        this();
        this.type = type;
        this.perimeter = perimeter;
        this.area = area;
    }

    public void showType() {
        System.out.println(type);
    }

    public void showPerimeter() {
        if (type.equalsIgnoreCase("circle")) {
            showCircumference();
        } else {
            System.out.println("Perimeter: " + perimeter);
        }
    }

    public void showCircumference() {
        System.out.println("Circumference: " + perimeter);
    }

    public void showArea() {
        System.out.println("Area: " + area);
    }

    public void showAll() {
        showType();
        showPerimeter();
        showArea();
    }

    @Override
    public Prototype getClone() {
        return new Shape(type, perimeter, area);
    }
}
