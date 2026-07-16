package arrays;

public class printSubArrays {
    
    public static void generateSubArrays(int nums[]){
        
        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                for(int k = i; k<=j; k++){ // Print the subarray from index i to j
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String [] args){

        int [] nums = {2,4,6,8,10};
        generateSubArrays(nums);
    }
}
