package Arrayproblems;

/*
Problem Statement:
Given a non-empty array of integers where every element appears twice
except for one, find that single one.

You must solve it using constant extra space.

Input:
int[] nums → array of integers

Output:
Integer → the element that appears only once

Example:
Input:  [4,1,2,1,2]
Output: 4

Explanation:
1 appears twice
2 appears twice
4 appears once

Approach:
1. Use XOR operation.
2. XOR of same numbers = 0
3. XOR of number with 0 = number
4. So all duplicate numbers cancel out,
   leaving only the single number.

Example:
4 ^ 1 ^ 2 ^ 1 ^ 2
= 4 ^ (1^1) ^ (2^2)
= 4 ^ 0 ^ 0
= 4

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SingleNumberInArray {

    public int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {

        SingleNumberInArray obj = new SingleNumberInArray();

        int[] arr = {4,1,2,1,2};

        System.out.println(
                obj.singleNumber(arr)
        );
    }
}