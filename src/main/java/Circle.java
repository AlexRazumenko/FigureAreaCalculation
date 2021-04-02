public class Circle extends Shape {

    public Circle(double radius, double area) {
        super(area);
        this.radius = radius;
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

}
