public class Multiples {

    public int[] arrayOfMultiples(int num, int length){
        int[] mult = new int[length];
        for (int i = 0; i < length; i++){
            mult[i] = num * (i+1);
        }
        return mult;
    }
}
