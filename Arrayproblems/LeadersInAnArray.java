package Arrayproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Problem Statement:
Given an array, find all leaders in the array.

An element is called a leader if it is greater than all elements
to its right side.

The rightmost element is always a leader.

Input:
int[] nums

Output:
List<Integer> containing leaders

Example:
Input:
[16,17,4,3,5,2]

Output:
[17,5,2]

Explanation:
17 > 4,3,5,2
5 > 2
2 is last element

------------------------------------------------

Approach

1. Traverse from right to left.
2. Keep track of rightMax.
3. If current > rightMax → leader.
4. Add to list.
5. Reverse the list at end.

Why reverse?
Because we traverse from right.

------------------------------------------------

Algorithm

rightMax = last element

add last element

for i from n-2 to 0
    if nums[i] > rightMax
        add
        update rightMax

reverse list

return list

------------------------------------------------

Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
*/

public class LeadersInAnArray {

    public List<Integer> leaders(int[] nums) {

        int n = nums.length;

        ArrayList<Integer> arrList =
                new ArrayList<>();

        int rightMax = nums[n - 1];

        arrList.add(rightMax);

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] > rightMax) {

                arrList.add(nums[i]);

                rightMax = nums[i];
            }
        }

        Collections.reverse(arrList);

        return arrList;
    }


    // -------- main method --------
    public static void main(String[] args) {

        LeadersInAnArray obj =
                new LeadersInAnArray();

        int[] nums = {16,17,4,3,5,2};

        List<Integer> result =
                obj.leaders(nums);

        System.out.println(result);
    }
}