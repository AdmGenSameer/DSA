/*
=========================================
LeetCode 977 - Squares of a Sorted Array
=========================================

Problem:
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in
non-decreasing order.

Example:
Input:  [-4, -1, 0, 3, 10]
Output: [0, 1, 9, 16, 100]

=========================================================
Approach 1: Square Every Element + Sort
=========================================================

Steps:
1. Create a new array.
2. Square each element and store it.
3. Sort the new array.
4. Return the sorted array.

Code Logic:

for(int i = 0; i < nums.length; i++){
    squaredArray[i] = nums[i] * nums[i];
}

Arrays.sort(squaredArray);

Dry Run:

nums = [-4, -1, 0, 3, 10]

After squaring:
[16, 1, 0, 9, 100]

After sorting:
[0, 1, 9, 16, 100]

Time Complexity:
O(n log n)

Space Complexity:
O(n)

=========================================================
Approach 2 (Optimal): Two Pointers
=========================================================

Observation:

The array is already sorted.

Negative numbers become positive after squaring.

Example:

nums = [-7, -3, 2, 3, 11]

Squares:
[49, 9, 4, 9, 121]

Largest square can come from:
- Leftmost element
- Rightmost element

Therefore compare both ends.

---------------------------------------------------------
Algorithm
---------------------------------------------------------

left = 0
right = n - 1
index = n - 1

While left <= right:

1. Calculate:
   leftSquare = nums[left] * nums[left]
   rightSquare = nums[right] * nums[right]

2. If leftSquare > rightSquare:
      result[index] = leftSquare
      left++
   Else:
      result[index] = rightSquare
      right--

3. index--

Repeat until left > right.

---------------------------------------------------------
Dry Run
---------------------------------------------------------

nums = [-4, -1, 0, 3, 10]

left = 0
right = 4
index = 4

Compare:
16 vs 100

result = [_, _, _, _, 100]

Compare:
16 vs 9

result = [_, _, _, 16, 100]

Compare:
1 vs 9

result = [_, _, 9, 16, 100]

Compare:
1 vs 0

result = [_, 1, 9, 16, 100]

Compare:
0 vs 0

result = [0, 1, 9, 16, 100]

---------------------------------------------------------
Optimal Code
---------------------------------------------------------

*/
class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }
}
/*
---------------------------------------------------------
Complexity Analysis
---------------------------------------------------------

Approach 1:
Time  : O(n log n)
Space : O(n)

Approach 2 (Optimal):
Time  : O(n)
Space : O(n)

=========================================================
Interview Tip
=========================================================

Whenever you see:

✓ Sorted Array
✓ Negative and Positive Numbers
✓ Need Sorted Result

Think:

"TWO POINTERS"

This is the expected interview solution.
=========================================================
*/
import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squaredArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squaredArray[i] = nums[i] * nums[i];
        }

        Arrays.sort(squaredArray);
        return squaredArray;
    }
}