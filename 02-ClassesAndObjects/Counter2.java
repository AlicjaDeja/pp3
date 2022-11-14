public class Counter2 {

    int counter = 0;

    public Counter2(int counter){
        this.counter = counter;
    }
    
    public void increaseByOne(){
        ++counter;
    }

    public void decreaseByTwo(){
        --counter;
    }

    public void increaseByTen(){
        counter += 10;
    }

    public void decreaseByTen(){
        counter -= 10;
    }

    // public static void main(String[] args){
    //     Counter c1 = new Counter(23);
    //     Counter c2 = new Counter(-47);
    // }

}
