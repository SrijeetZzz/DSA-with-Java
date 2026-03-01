package Arrayproblems;
// You are given an integer array representing a permutation of numbers.

// Your task is to rearrange the array into the next lexicographically greater permutation. (dictionary order)

// If such a permutation does not exist (i.e., the array is in descending order), rearrange it into the lowest possible order (ascending order).

// You must:

// Modify the array in place

// Use constant extra space

// ex 1:
// Input:  [1, 2, 3]
// Output: [1, 3, 2]
// ex 2:
// Input:  [3, 2, 1]
// Output: [1, 2, 3]

// approach:
// 1. First initialize the ind=-1, so if the array is in sorted order then just reverse that
// 2. Second find the pivot element from end (pivot element => find if num[n-1] < num[n] then ind==n-1) and exit from loop
// 3. Then find the next big number from the pivot element 
// 4. Then Swap the number with pivot element and exit from loop
// 5. Then Reverse the array from pivot to end
// 6. For simplicity make two fns swap and reverse and call them  



public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }
        reverse(nums, ind + 1, n - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
