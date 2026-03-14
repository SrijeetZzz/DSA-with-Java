package Arrayproblems;

/*
Problem Statement:
Given an integer array nums, find the contiguous subarray
(with at least one element) which has the largest sum
and return its sum.

Also print the subarray that gives the maximum sum.

Example:
Input:  [-2,1,-3,4,-1,2,1,-5,4]
Output:
Max Sum = 6
Subarray = [4, -1, 2, 1]


Algorithm (Kadane's Algorithm with subarray tracking):

1. Initialize:
   sum = 0
   max = -∞
   start = 0
   ansStart = 0
   ansEnd = 0

2. Traverse array from left to right

3. If sum == 0
      start = current index
   (new subarray starts)

4. Add current element to sum

5. If sum > max
      max = sum
      ansStart = start
      ansEnd = current index

6. If sum < 0
      sum = 0
   (discard negative sum)

7. After loop,
   print elements from ansStart to ansEnd

8. Return max


Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution2 {

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        for (int i = 0; i < nums.length; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += nums[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        // print subarray
        System.out.print("Subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return max;
    }
     public static void main(String[] args) {

        Solution2 obj = new Solution2();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = obj.maxSubArray(nums);

        System.out.println("Max Sum = " + result);
    }
}