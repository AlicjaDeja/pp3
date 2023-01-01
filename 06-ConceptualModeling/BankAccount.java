public class BankAccount{
    int money;

    public void Deposit(int amount){
        money += amount;
    }

    public void Withdraw(int amount){
        if (money < amount){
            System.out.println("Not enough money");
        } 
        else if (amount > 500) {
            System.out.println("Limit of 500");}
        else {
        money -= amount;}
    }

    public void Display(){
        System.out.println(money);
    }

    public static void main(String[] args){
        BankAccount a = new BankAccount();
        a.Deposit(500);
        a.Display();
        a.Deposit(200);
        a.Display();
        a.Withdraw(800);
        a.Display();

    }
}