public class Lamp {

    boolean lamp;

    public void turnOn(){
        if (lamp == false){
            lamp = true;
        }
    }

    public void turnOff(){
        if (lamp == true){
            lamp = false;
        }
    }

    public void display(){
        if (lamp == true){
            System.out.println("The lamp is on.");
        } else {
            System.out.println("The lamp is off.");
        }
    }
    
}
