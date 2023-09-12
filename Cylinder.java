public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;

    }
    public double V(){
        double v = (4 * Math.PI * super.radius)/3;
        return v;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


}
