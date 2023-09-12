public class Circle {
    // static được dùng để khai báo thuộc tính và phương thức (của lớp) chứ k phải đối tượng
    protected double radius;
    protected String color;//thuộc tính

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;

    }

    public double getRadius() { // phương thức
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  double S(){
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public void go(){
        System.out.println(this.radius + " bes quá");
    }


}
