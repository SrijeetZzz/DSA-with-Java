package Arrayproblems;

/*
Problem Statement:
Given an integer array representing a permutation of numbers,
rearrange the array into the next lexicographically greater permutation.

If such permutation is not possible (array is in descending order),
then rearrange it into the lowest possible order (ascending order).

Conditions:
- Modify the array in-place
- Use constant extra space

Input:
int[] nums

Output:
Array modified in-place to next permutation

Example 1:
Input:  [1, 2, 3]
Output: [1, 3, 2]

Example 2:
Input:  [3, 2, 1]
Output: [1, 2, 3]

Approach:
1. Find the pivot index from the end such that nums[i] < nums[i+1].
   This is the first decreasing element from right.
2. If no such index exists, the array is in descending order,
   so reverse the entire array.
3. Otherwise, find the next greater element from the right side of pivot.
4. Swap pivot with that element.
5. Reverse the subarray after pivot to get the next smallest order.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // Step 1: find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: if no pivot, reverse whole array
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: find next greater element
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }

        // Step 4: reverse right part
        reverse(nums, ind + 1, n - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}