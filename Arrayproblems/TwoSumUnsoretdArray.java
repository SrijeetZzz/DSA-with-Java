package Arrayproblems;
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// approach:

// 1. Check if the target-nums[i] elemnt exist in the array or not
// 2. For non sorted we use map (to store index)
// 3. For sorted we use two pointer
// 4. If just true false is req then we can use set.
// 5. Check if the rem value exist in the map or not else put the curr value;

import java.util.HashMap;
import java.util.Arrays;

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