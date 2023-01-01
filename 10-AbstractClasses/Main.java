public class Main {
    public static void main(String[] args){

        Rectangle r = new Rectangle(4, 5);
        System.out.println(r.area());
        System.out.println(r.paramether());

        Triangle t = new Triangle(4, 5);
        System.out.println(t.area());
        System.out.println(t.paramether());

        Circle c = new Circle(4);
        System.out.println(c.area());
        System.out.println(c.paramether());
    }
}

