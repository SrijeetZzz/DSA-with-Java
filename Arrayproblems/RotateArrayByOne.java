package Arrayproblems;

/*
Problem Statement:
Rotate the array to the left by one position.

Input:
int[] nums → array of integers

Output:
Array rotated in-place by one position.

Example:
Input:  [1,2,3,4,5]
Output: [2,3,4,5,1]

Approach:
1. Store the first element of the array.
2. Shift all elements one position to the left.
3. Put the stored element at the last index.

Key Points:
- In-place rotation
- Only one pass required

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RotateArrayByOne {

    public void rotateArrayByOne(int[] nums) {

        int val = nums[0];

        for (int i = 1; i < nums.length; i++)
            nums[i - 1] = nums[i];

        nums[nums.length - 1] = val;
    }

    public static void main(String[] args) {

        RotateArrayByOne obj = new RotateArrayByOne();

        int[] arr = {1,2,3,4,5};

        obj.rotateArrayByOne(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}