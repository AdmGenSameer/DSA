package arrays;

public class kadaneAlgo {
    
    public static void maxSum(int [] nums){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            currSum += nums[i];
            if(currSum<0){
                currSum = 0;
            }
            if(maxSum<currSum){
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int [] nums = {-2,-3,4,-1,-2,1,5,-3};
        maxSum(nums);
    }
}
