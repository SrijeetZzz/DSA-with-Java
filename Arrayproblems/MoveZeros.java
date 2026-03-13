package Arrayproblems;

/*
Problem Statement:
Move all zeros in the array to the end while maintaining
the relative order of non-zero elements.

Input:
int[] nums → array of integers

Output:
Modify the array in-place so that all zeros are moved
to the end while keeping order of non-zero elements.

Example:
Input:  [0,1,0,3,12]
Output: [1,3,12,0,0]

Approach:
1. Use a pointer zp (zero position) to track where the next
   non-zero element should go.
2. Traverse the array.
3. If current element is not zero,
   swap it with element at zp.
4. Increment zp.
5. This keeps all non-zero elements in front
   and moves zeros to the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int zp = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[zp];
                nums[zp] = temp;

                zp++;
            }
        }
    }

    public static void main(String[] args) {

        MoveZeros obj = new MoveZeros();

        int[] arr = {0,1,0,3,12};

        obj.moveZeroes(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}