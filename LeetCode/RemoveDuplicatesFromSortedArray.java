/*
Remove Duplicates from Sorted Array

Revision notes:
- The array is sorted, so duplicates are adjacent.
- Use two pointers:
  - i scans the array
  - k tracks the next position for a unique value
- Keep the first occurrence of each value in-place.

Quick dry run:
nums = [1, 1, 2]
k starts at 1
- i = 1 -> duplicate, skip
- i = 2 -> new value, write nums[1] = 2, k = 2

Complexity:
- Time: O(n)
- Space: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
