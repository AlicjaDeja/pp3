public class BankAccount {
    
    //Object attributes
    String name;
    String bank;
    boolean loggedIn;
    double money;
    int accountNumber;


    

    //Object methods
    public void display(){
        System.out.println("Bank: "+bank);
        System.out.println("Name: "+name);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Logged in: "+ loggedIn);
        System.out.println("Money: "+money);
    }
    public void takeMoney(double[] amount){
        

    }
    public void logIn(){
        loggedIn =! loggedIn;
    }

    public void takeLoan(int[] amount){

    }
}
