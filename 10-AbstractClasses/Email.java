public class Email extends Message{

    private String emailAddress;
    private String emailSubject;

    public String getEmailAddress() {
        return emailAddress;
        
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public Email(String emailSubject, String emailAddress, String text){
        super(text);
        this.emailAddress = emailAddress;
        this.emailSubject = emailSubject;
    }

    @Override
    public void send() {
        System.out.println("Address: "+this.emailAddress);
        System.out.println("Subject: "+this.emailSubject);
        System.out.println("Email: "+getText());
        System.out.println("Num of characters: "+ charNumber());
        
    }

    public static void main(String[] args){
        Email e = new Email("Hello", "123@gmail.com", "Thank you!");
        e.send();
    }

    
    
}