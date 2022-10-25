public class SurfaceArea{

    public static double circleArea(double radius){
        return radius * radius * 3.14;
    }

    public static double triangleArea(double base, double height){
        return base*height/2;
    }

    public static double rectangleArea(double length, double width){
        return length * width;
    }
    

    public static void main(String[] args){
        System.out.println("Rectangle "+ SurfaceArea.rectangleArea(4,5));
        System.out.println("Circle "+ SurfaceArea.circleArea(3));
        System.out.println("Triangle " + SurfaceArea.triangleArea(3,4));
    }

}