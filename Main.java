class Main{
    public static void main(String[] args) {
    Cylinder a = new Cylinder(3.4,"Blue",5);//đối tượng được khởi tạo sau new
        System.out.println(a.S());
        System.out.println(a.V());
        System.out.println(a);
        Circle b = new Cylinder(1.2,"đen",3.4);
        a.go();
        Circle f = new Circle(3.3,"đen");
        f.go();
    }
}