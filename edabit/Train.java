public class Train {
    
    public static int findSeat(int num, int[] arr){
        int max = num / arr.length;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= max /2){
                return i;
            } 
        
    }
    return -1;
    }
}
