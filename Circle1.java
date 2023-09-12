public class Circle1 extends Shape {
    private double radius = 1.0;

    public Circle1(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double Area = Math.pow(this.radius, 2) * Math.PI;
        return Area;
    }

    public double getPerimeter() {
        double Perimeter = Math.PI * 2 * this.radius;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
