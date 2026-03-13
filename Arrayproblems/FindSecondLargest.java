package Arrayproblems;

/*
Problem Statement:
Find the second largest element in an integer array.

Input:
An integer array nums.

Output:
Return the second largest element in the array.

Example:
Input:  [5, 2, 9, 1, 7]
Output: 7

Approach:
1. First find the maximum element in the array by traversing once.
2. Then traverse again to find the largest element that is not equal to the maximum.
3. Keep track of the second maximum while iterating.
4. Return the second maximum value.

Time Complexity: O(n) + O(n) = O(n)
Space Complexity: O(1)
*/

public class FindSecondLargest {

    public int secondLargestElement(int[] nums) {

        int max = Integer.MIN_VALUE;

        for (int x : nums)
            if (x > max) max = x;

        int secMax = Integer.MIN_VALUE;

        for (int x : nums)
            if (x > secMax && x != max)
                secMax = x;

        return secMax;
    }

    public static void main(String[] args) {

        FindSecondLargest obj = new FindSecondLargest();

        int[] arr = {5, 2, 9, 1, 7};

        System.out.println(obj.secondLargestElement(arr));
    }
}