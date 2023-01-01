public class Circle extends Shape {

    private double a;

    public Circle(double a) {
        this.a = a;  
    }
    
    public double area(){
        return a*a*3.14;
    }

    public double paramether(){
        return 2*a*3.14;
    }
    

      
}