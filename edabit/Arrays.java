public class Arrays {
    
    
    
    public static void main(String[] args){
        int[] arr = {1,2,6,8,5};
        int minimum = 10;
        int maximum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minimum){minimum = arr[i];}
            if (arr[i] > maximum){maximum = arr[i];}
        }
        System.out.println("Minimum: "+minimum);
        System.out.println("Max: "+ maximum);
    }

}
