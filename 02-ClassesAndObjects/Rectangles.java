public class Rectangles {

    int a;
    int b;
    
    
    public static void rectangle(int a, int b){
        int surface = a*b;
        int perimiter = a*2 + b*2;

        System.out.println("The dimension of the rectangle are: "+a+", "+b);
        System.out.println("The surface of the rectangle is: "+surface);
        System.out.println("The perimiter of the rectangle is: "+perimiter);
    }

    public static void main(String[] args){
        rectangle(3, 4);
        rectangle(2, 7);
    }
}
