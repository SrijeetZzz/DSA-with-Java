package Arrayproblems;

/*
Problem Statement:
Search for a target element in the array using Linear Search.

Input:
int[] nums → array of integers
int target → element to search

Output:
Return index of target if found,
otherwise return -1.

Example:
Input: nums = [5,3,7,1], target = 7
Output: 2

Input: nums = [5,3,7,1], target = 9
Output: -1

Approach:
1. Traverse the array from index 0 to n-1.
2. Compare each element with target.
3. If element == target → return index.
4. If loop finishes without finding target → return -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LinearSearch {

    public int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target)
                return i;

        return -1;
    }

    public static void main(String[] args) {

        LinearSearch obj = new LinearSearch();

        int[] arr = {5,3,7,1};

        System.out.println(
                obj.linearSearch(arr, 7)
        );
    }
}