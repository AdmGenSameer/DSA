package Arrays;
import java.util.Arrays;
import java.util.Scanner;

class binarySearch{
    public static int binarySearch(int number[], int key){ 
    int start = 0;
    int end = number.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(number[mid] == key){
                return mid;
            }
            else if(number[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

            
        }
        return -1;
};
public static void main(String[] args){
    int number[] = {1,2,5,7,3,12,15,17,20};
    int key = 12;
    System.out.println("index of key is at: " + binarySearch(number, key));
}
    
}