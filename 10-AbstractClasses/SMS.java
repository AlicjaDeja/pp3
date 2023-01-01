public class SMS extends Message{

    private String phoneNumber;
    

    public SMS(String phoneNumber, String text){
        super(text);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Phone number: "+this.phoneNumber);
        System.out.println("Message: "+getText());
        System.out.println("Number of characters: "+charNumber());
        
    }

    public static void main(String[] args){
        SMS t = new SMS("1234567", "Hello World");
        t.send();

    }
    

}