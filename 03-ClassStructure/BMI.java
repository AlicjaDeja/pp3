public class BMI {

    String name;
    double weight;
    double height;
    double BMI;

    public BMI(String name){
        this.name=name;
    }

    public void setWeightAndHeight(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        BMI = weight / (height*height)*10000;
        return BMI;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Weight: "+weight+" kg");
        System.out.println("Height: "+height+" m");
        System.out.printf("BMI: %.1f", BMI, "\n");
        if (BMI <= 18.5) {
            System.out.println("BMI is too low.");} else if (BMI >= 24.9){
                System.out.println("BMI is too high.");} else {
                    System.out.println("BMI is normal.");}
    }

    public static void main(String[] args){
        BMI p1 = new BMI("Anna");
        BMI p2 = new BMI("Mia");
        BMI p3 = new BMI("Sol");
        p1.setWeightAndHeight(40, 153);
        p1.calculateBMI();
        p1.display();
        p2.setWeightAndHeight(78, 158);
        p2.calculateBMI();
        p2.display();
        p3.setWeightAndHeight(51, 166);
        p3.calculateBMI();
        p3.display();
    }
}
