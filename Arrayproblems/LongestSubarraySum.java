package Arrayproblems;

/*
Problem Statement:
Find the length of the longest subarray whose sum is equal to k.

Input:
int[] nums → array of integers
int k → target sum

Output:
Return an integer representing the length of the longest subarray
whose sum equals k.

Example:
Input: nums = [1,2,1,1,1,3,2], k = 3
Output: 3
Explanation:
The longest subarray with sum = 3 is [1,1,1].

Approach:
1. Use the sliding window technique.
2. Maintain two pointers: left and right.
3. Expand the window by increasing right and adding nums[right] to sum.
4. If sum becomes greater than k, shrink the window from the left
   by subtracting nums[left] and moving left forward.
5. Whenever sum equals k, update the maximum length of the subarray.
6. Continue until the right pointer reaches the end of the array.

Time Complexity: O(n)
Space Complexity: O(1)

Note:
This approach works correctly when the array contains only positive integers.
*/

public class LongestSubarraySum {

    public int longestSubarray(int[] nums, int k) {

        int left = 0;
        int sum = 0;
        int maxCount = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum > k && left <= right) {

                sum -= nums[left];
                left++;
            }

            if (sum == k) {

                maxCount = Math.max(maxCount, right - left + 1);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        LongestSubarraySum obj = new LongestSubarraySum();

        int[] arr = {1,2,1,1,1,3,2};
        int k = 3;

        System.out.println(obj.longestSubarray(arr, k));
    }
}