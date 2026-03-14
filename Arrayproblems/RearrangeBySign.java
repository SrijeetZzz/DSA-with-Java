package Arrayproblems;

import java.util.Arrays;

/*
Problem Statement:
Given an array nums with equal number of positive and negative integers,
rearrange the array so that positive and negative numbers alternate,
starting with positive.

Input:
nums = [3,1,-2,-5,2,-4]

Output:
[3,-2,1,-5,2,-4]

Conditions:
- Equal positives and negatives
- Order should be maintained

------------------------------------------------

Approach 1 (Your approach using extra arrays)

1. Create two arrays:
   posArr → store positives
   negArr → store negatives

2. Traverse nums:
   if > 0 → posArr
   else → negArr

3. Fill original array:
   nums[0] = pos
   nums[1] = neg
   nums[2] = pos
   nums[3] = neg

Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------

Approach 2 (Optimal)

Use result array and place directly.

pos index = 0
neg index = 1

if positive → put at pos index → +2
if negative → put at neg index → +2

Time Complexity: O(n)
Space Complexity: O(n) (but no extra pos/neg arrays)

------------------------------------------------
*/

public class RearrangeBySign {


    // -------- your approach --------
    public int[] rearrange(int[] nums) {

        int n = nums.length;

        int[] posArr = new int[n / 2];
        int[] negArr = new int[n / 2];

        int posInd = 0;
        int negInd = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {
                posArr[posInd++] = nums[i];
            } else {
                negArr[negInd++] = nums[i];
            }
        }

        int ind = 0;

        for (int i = 0; i < n / 2; i++) {

            nums[ind] = posArr[i];
            nums[ind + 1] = negArr[i];

            ind += 2;
        }

        return nums;
    }


    // -------- optimal approach --------
    public int[] rearrangeOptimal(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;
    }


    // -------- main method --------
    public static void main(String[] args) {

        RearrangeBySign obj = new RearrangeBySign();

        int[] nums = {3,1,-2,-5,2,-4};

        int[] res1 = obj.rearrange(nums.clone());
        int[] res2 = obj.rearrangeOptimal(nums.clone());

        System.out.println("Your approach : " + Arrays.toString(res1));
        System.out.println("Optimal       : " + Arrays.toString(res2));
    }
}

