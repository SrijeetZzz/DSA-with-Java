package Arrayproblems;

/*
Problem Statement:
Given an array nums, return the running sum of the array.

Running sum means:
runningSum[i] = nums[0] + nums[1] + ... + nums[i]

Input:
int[] nums → array of integers

Output:
int[] → array where each element is the running sum

Example:
Input:  [1,2,3,4]
Output: [1,3,6,10]

Explanation:
1
1+2 = 3
1+2+3 = 6
1+2+3+4 = 10

Approach:
1. Initialize a variable sum = 0.
2. Traverse the array from left to right.
3. Add current element to sum.
4. Replace current element with sum.
5. Return the modified array.

Key Points:
- Done in-place
- No extra array needed

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RunningSum1DArray {

    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }

    public static void main(String[] args) {

        RunningSum1DArray obj = new RunningSum1DArray();

        int[] nums = {1, 2, 3, 4};

        int[] result = obj.runningSum(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}