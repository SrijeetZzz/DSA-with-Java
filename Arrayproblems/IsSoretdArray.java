package Arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;

/*
Problem Statement:
Check whether the given array is sorted in non-decreasing order.

Input:
ArrayList<Integer> nums

Output:
true  → if array is sorted
false → if array is not sorted

Example:
Input:  [1,2,3,4,5]
Output: true

Input:  [1,3,2,4]
Output: false

Approach:
1. Start checking from index 1.
2. Compare current element with previous element.
3. If current < previous → array is not sorted.
4. If no violation found till end → array is sorted.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class IsSoretdArray {

    public boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 1; i < nums.size(); i++) {

            if (nums.get(i) < nums.get(i - 1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        IsSoretdArray obj = new IsSoretdArray();

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(obj.isSorted(list));
    }
}