package Arrayproblems;

/*
Problem Statement:
Given an array of positive integers nums and a positive integer target,
return the minimal length of a contiguous subarray whose sum is
greater than or equal to target.
If there is no such subarray, return 0.

Input:
int target → target sum
int[] nums → array of positive integers

Output:
Integer → minimum length of subarray with sum ≥ target

Example:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation:
Subarray [4,3] has sum = 7 and length = 2 (minimum possible).

Approach:
1. Use sliding window technique.
2. Keep two pointers: left and right.
3. Expand window by adding nums[right] to sum.
4. When sum ≥ target, try to shrink window from left
   to get minimum length.
5. Update minimum length whenever condition is satisfied.
6. If no valid subarray found, return 0.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MinimumSizeSubArray {

    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            sum += nums[right];

            while (sum >= target) {

                min = Math.min(min, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {

        MinimumSizeSubArray obj = new MinimumSizeSubArray();

        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        int result = obj.minSubArrayLen(target, nums);

        System.out.println("Minimum Length: " + result);
    }
}