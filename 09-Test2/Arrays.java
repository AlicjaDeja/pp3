public class Arrays {

    public static boolean arr(int[] arr1, int[] arr2) {
      // Count the number of two-digit numbers in arr1
      int count1 = 0;
      for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] >= 10 && arr1[i] < 100) {
          count1++;
        }
      }
  
      // Count the number of two-digit numbers in arr2
      int count2 = 0;
      for (int i = 0; i < arr2.length; i++) {
        if (arr2[i] >= 10 && arr2[i] < 100) {
          count2++;
        }
      }
  
     
     // Return true if the number of two-digit numbers in arr1 and arr2 are the same, false otherwise 
     if (count1 == count2){
        return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        System.out.println(arr(arr1,arr2));
    }
}

  
