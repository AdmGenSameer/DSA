package Arrays;



import java.util.*;

public class largestInArray {
    


    public static int largestElement(int arr[]){
        int max_element = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (max_element<arr[i]) {
                    max_element = arr[i];
                }
                if (min_value>arr[i]) {
                    min_value = arr[i];
                    
                }
            }

        return max_element;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,56,895,5,154651,54616,6461,64651,6,6515,5655,564,546,64,46,467,464,4648,464,6,4,868,48,484,84,8,18,8,8,48,4,8,484};
        int largest = largestElement(arr);
        System.out.println(largest);
        
        
    }
}
