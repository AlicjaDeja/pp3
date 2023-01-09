public class Main {
public static void main(String[] args) {
    TV t = new TV();
    t.on();
    t.display();
    t.channelUp();
    t.setChannel(7);
    t.display();
    t.setChannel(142);
    t.display();
    t.channelDown();
    t.display();
    t.off();
    t.display();
}
    
}
