public class Smartphone {
    
    //Object attributes

    String model;
    double memory;
    boolean active;
    String favContact;
    int battery;


    //Object methods

    public void activate(){
        active =! active;
    }
    public void display(){
        System.out.print("This model is a "+model);
        System.out.println(" with "+memory+" GB of memory.");
        System.out.print("It has "+battery+"% of battery. ");
        System.out.println("The phone is active: "+active);
    }
    public void takePicture(){
        memory = memory - 0.1 ;
        System.out.println("The phone took a picture. It now has "+ memory +" GB of memory");
    }
    public void call(){
        System.out.println("Calling "+'"'+favContact+'"');
    }
    public void playGame(){
        --battery;
        System.out.println("You played a game. The battery is now at "+ battery +"%");
    }

    public static void main(String[] args){
        Smartphone smartphone1 = new Smartphone();
        smartphone1.model = "iPhone 11";
        smartphone1.memory = 64;
        smartphone1.active = true;
        smartphone1.favContact = "Mom";
        smartphone1.battery = 80;
        smartphone1.display();
        smartphone1.activate();
        smartphone1.takePicture();
        smartphone1.call();
        smartphone1.playGame();
        smartphone1.display();
    }
}
