public class Student{
    
    // Object attributes
    String name;
    int age;
    String studentID;
    boolean validity;
    int semester;
    double averageGrade;
    
    //Object methods
    
    public void sayHello(){
        System.out.println("Hello");
    }
    public void displayName(){
        System.out.println("My name is "+name);
    }
    public void displayAge(){
        System.out.println("My age is "+age);
    }
    public void display1(){
        System.out.println("Student's name: "+name);
        System.out.println("Semester number: "+semester);
        System.out.println("Average grade: "+averageGrade);
    }
    public void changeCardValidation(){
         validity = !validity;
    }
    public void display3(){
        System.out.println("Student's name: "+name);
        System.out.println("ID card number: "+studentID);
        System.out.println("ID card is valid: "+validity);
    }
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Alicja";
        student1.age = 19;
        student1.studentID = "221405";
        student1.validity = true;
        student1.semester = 3;
        student1.averageGrade = 3.5;
        student1.display1();
        student1.display3();
        student1.changeCardValidation();
        student1.display3();
    }
}
