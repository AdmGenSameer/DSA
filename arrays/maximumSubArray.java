package arrays;

/* public class maximumSubArray {
    
    public static void maxSum(int [] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                currSum = 0;
                for(int k = i; k<=j; k++){ // Print the subarray from index i to j
                    currSum += nums[k];
                }
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum is:" + maxSum);
    }


    public static void main(String[] args) {
        int [] nums = {2,4,6,8,10};
        maxSum(nums);
    }
}
 */

//Optimized Approach - Prefix Sum

public class maximumSubArray{

    public static void maxSum(int [] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        //Calculate Prefix
        for(int i =1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            int start = i;

            for(int j=i; j<nums.length;j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String [] args){
        int [] nums = {1,-2,6,-1,3};
        maxSum(nums);
    }
}