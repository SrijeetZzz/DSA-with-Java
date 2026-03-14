package Arrayproblems;

/*
Problem Statement:
Given an integer array nums, find the contiguous subarray
(with at least one element) which has the largest sum
and return its sum.

This is the classic Maximum Subarray problem.

Input:
int[] nums

Output:
int → maximum subarray sum

Example:
Input:  [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation:
Subarray [4,-1,2,1] has sum = 6

------------------------------------------------
Approach : Kadane's Algorithm
------------------------------------------------
1. Keep a running sum.
2. Add current element to sum.
3. If sum becomes negative → reset to 0.
4. Keep track of maximum sum seen so far.
5. Return max.

Important:
Initialize max with Integer.MIN_VALUE
to handle all negative arrays.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public static int MaximumSubArraySumKadanesAlgo(int[] nums) {

        int sum = 0;   
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
    public static void main(String[] args) {

        int[] nums = {2,3,-3,10,-5,3};

        int result = MaximumSubArraySumKadanesAlgo(nums);

        System.out.println(result);
    }
}
