package Arrayproblems;

/*
Problem Statement:
Rotate the array to the left by k positions.

Input:
int[] nums → array of integers
int k → number of positions to rotate

Output:
Array rotated in-place by k positions.

Example:
Input:  nums = [1,2,3,4,5], k = 2
Output: [3,4,5,1,2]

-------------------------------------------------
Approach 1 (My Approach):
1. Rotate the array one position to the left k times.
2. Store first element.
3. Shift all elements left.
4. Put stored element at end.
5. Repeat k times.

Time Complexity: O(n × k)
Space Complexity: O(1)

-------------------------------------------------
Approach 2 (Optimal Approach – Reverse Method):
1. Reverse first k elements.
2. Reverse remaining elements.
3. Reverse whole array.

For left rotation:
reverse(0, k-1)
reverse(k, n-1)
reverse(0, n-1)

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RotateArrayByKPosition {

    // ---------- Approach 1 ----------
    public void rotateArray(int[] nums, int k) {

        while (k > 0) {

            int val = nums[0];

            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }

            nums[nums.length - 1] = val;

            k--;
        }
    }


    // ---------- Approach 2 (Optimal) ----------
    public void rotateArrayOptimal(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }


    public void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }


    public static void main(String[] args) {

        RotateArrayByKPosition obj = new RotateArrayByKPosition();

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        int k = 2;

        // My approach
        obj.rotateArray(arr1, k);

        System.out.print("My approach: ");
        for (int x : arr1)
            System.out.print(x + " ");

        System.out.println();

        // Optimal approach
        obj.rotateArrayOptimal(arr2, k);

        System.out.print("Optimal: ");
        for (int x : arr2)
            System.out.print(x + " ");
    }
}