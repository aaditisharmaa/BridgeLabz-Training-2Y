public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box b1 = new Box(2, 3, 4);
        System.out.println("Volume: " + b1.getVolume());
    }
}
