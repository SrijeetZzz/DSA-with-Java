package Arrayproblems;

/*
Problem Statement:
Find the maximum number of consecutive 1's in a binary array.

Input:
An integer array nums containing only 0s and 1s.

Output:
Return an integer representing the maximum number of consecutive 1's.

Example:
Input:  [1,1,0,1,1,1]
Output: 3

Approach:
1. Initialize two variables:
   - count → to keep track of current consecutive 1s.
   - maxCount → to store the maximum consecutive 1s found so far.
2. Traverse the array.
3. If the current element is 1:
      increase count and update maxCount using Math.max().
4. If the current element is 0:
      reset count to 0 because the sequence of 1s is broken.
5. Continue until the array ends.
6. Return maxCount.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FindConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        FindConsecutiveOnes obj = new FindConsecutiveOnes();

        int[] arr = {1,1,0,1,1,1};

        System.out.println(obj.findMaxConsecutiveOnes(arr));
    }
}