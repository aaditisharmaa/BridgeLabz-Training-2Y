public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
    }
}
