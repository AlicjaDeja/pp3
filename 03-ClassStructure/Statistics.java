public class Statistics {

    int x;
    int y;

    public static int itemsRange(int x, int y){
        return y - x + 1;
    }

    public static int sumRange(int x, int y){
        return (y-x+1)*(x+y)/2;
    }

    public static int meanRange(int x, int y){
        return (y-x+1)*(x+y)/2 / (y - x + 1);
    }

    public static void main(String[] args){
        System.out.println("Number of items: "+itemsRange(5, 10));
        System.out.println("Sum: "+sumRange(5, 10));
        System.out.println("Mean: "+meanRange(5, 10));
    }
}
