public class Triangle extends Shape {

    double a;
    double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area(){
        return a*b*(1.0/2.0);
    }

    public double paramether(){
        return a*3;
    }



  
}