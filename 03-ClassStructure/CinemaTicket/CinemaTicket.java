public class CinemaTicket
{
    
    static String cinemaName;
    String filmTitle;
    int row;
    int seat;
    double price;

    public CinemaTicket(String filmTitle, int row, int seat){
        if (row <= 2){
            this.price = 10.0;
        } else {
            this.price = 25.0;
        }
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;

    }

    public void display(){
        System.out.println("You bought a ticket for: "+ filmTitle);
        System.out.println("You're seated in a "+row+" row, on a "+seat+" seat");
        System.out.println("You paid: "+ price + " PLN");
        System.out.println("In a cinema: "+ cinemaName);
    }
    
    public static void main(String[] args){

        cinemaName = "Morning Star cinema";
        CinemaTicket t1 = new CinemaTicket("Gladiator", 2, 8);
        CinemaTicket t2 = new CinemaTicket("Gladiator",7,8);
        t1.display();
        t2.display();


        // cinemaName = "Multikino";
        // CinemaTicket ct1 = new CinemaTicket();
        // ct1.filmTitle = "Avengers";
        // ct1.row = 5;
        // ct1.seat = 12;
        // ct1.price = 23;
        // ct1.display();

        // CinemaTicket ct2 = new CinemaTicket();
        // ct2.filmTitle = "Scream";
        // ct2.price = 20.50;
        // ct2.row = 8;
        // ct2.seat = 7;
        // ct2.display();
    
    }


}
