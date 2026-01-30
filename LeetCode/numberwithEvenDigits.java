
class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitNumber = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int strLength = String.valueOf(nums[i]).length();
            if (strLength % 2 == 0) {
                evenDigitNumber++;
            }
        }
        return evenDigitNumber;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        Solution solution = new Solution();
        int result = solution.findNumbers(nums);
        System.out.println("Even digit numbers: " + result);
    }
}
