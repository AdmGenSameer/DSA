package Arrays;

public class largestinArray {
    
    public static int largestinArray(int num[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i = 0; i<num.length;i++){
            if(largest<num[i]){
                largest = num[i];
            }
            if(smallest>num[i]){
                smallest = num[i];
            }
        };
        System.out.println("The smallest number in the array:"+ smallest);
        return largest;
    };

    public static void main(String[] args) {

        int num[] = {1,2,4,8,3,12};
        System.out.println("The largest number in the array:"+ largestinArray(num));
    };
    
};
