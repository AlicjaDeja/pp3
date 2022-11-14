public class myArrays {

    int[] array;

    public myArrays(int[] array){
        this.array = array;
    }

    public static int even(int[] array){
        int count = 0;
        for (int i= 0; i< array.length ; i++){
            if (array[i] % 2 == 0) count++;
        }
        return count;
    }

    public static int positiveOdd(int[] array){
        int count = 0;
        for (int i= 0; i< array.length ; i++){
            if (array[i] % 2 != 0 && array[i]>0) count++;
        }
        return count;
    }

    // public static void main(String[] args){
    //     int[] ar1 = {2,5,7,8,-10};
    //     myArrays m = new myArrays(ar1);
    //     System.out.println(even(ar1));
    //     System.out.println(positiveOdd(ar1));
    // }

    
}
