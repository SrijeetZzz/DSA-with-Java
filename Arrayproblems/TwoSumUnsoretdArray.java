package Arrayproblems;

import java.util.HashMap;
import java.util.Arrays;

/*
Problem Statement:
Given an array of integers nums and an integer target,
return the indices of the two numbers such that they add up to target.

Conditions:
- Exactly one solution exists.
- You may not use the same element twice.
- The answer can be returned in any order.

Input:
int[] nums → unsorted integer array
int target → target sum

Output:
int[] → indices of two numbers whose sum equals target

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Approach:
1. Use a HashMap to store elements and their indices.
2. Traverse the array.
3. For each element, calculate complement = target - nums[i].
4. Check if complement already exists in the map.
5. If yes → return the stored index and current index.
6. Otherwise store nums[i] with its index in the map.

Notes:
- For unsorted arrays → HashMap approach.
- For sorted arrays → two pointer technique.
- If only existence (true/false) is required → HashSet can be used.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class TwoSumUnsoretdArray {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (hm.containsKey(complement)) {
                return new int[]{hm.get(complement), i};
            }

            hm.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}