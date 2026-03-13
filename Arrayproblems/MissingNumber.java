package Arrayproblems;

/*
Problem Statement:
Given an array containing n distinct numbers taken from 0 to n,
find the one number that is missing from the array.

Input:
int[] nums → array containing n distinct numbers in range [0, n]

Output:
Integer → the missing number

Example:
Input: [3,0,1]
Output: 2

Explanation:
Numbers should be from 0 to 3.
Present numbers = 0,1,3
Missing number = 2

Approach:
1. The sum of numbers from 0 to n is:
   n * (n + 1) / 2
2. Calculate the expected sum using formula.
3. Calculate the actual sum of array elements.
4. Missing number = expected sum − actual sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int acc = (n * (n + 1)) / 2;

        int sum = 0;

        for (int x : nums)
            sum += x;

        return acc - sum;
    }

    public static void main(String[] args) {

        MissingNumber obj = new MissingNumber();

        int[] arr = {3,0,1};

        System.out.println(obj.missingNumber(arr));
    }
}