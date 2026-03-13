package Arrayproblems;

/*
Problem Statement:
Given an integer array nums, return the number of reverse pairs.

A reverse pair is defined as:
i < j and nums[i] > 2 * nums[j]

Input:
Integer array nums

Output:
Integer → number of reverse pairs

Example:
Input: [1,3,2,3,1]
Output: 2

Explanation:
Reverse pairs are:
(3,1) and (3,1)

Approach:
1. Use Merge Sort to divide the array.
2. Before merging two sorted halves, count reverse pairs.
3. For each element in left half,
   move pointer in right half while nums[i] > 2 * nums[j].
4. Add number of valid elements to count.
5. Then merge the two sorted halves normally.
6. This works because both halves are sorted.

Why Merge Sort?
Brute force = O(n^2)
Merge sort approach = O(n log n)

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

public class CountReversePairs {

    public int count = 0;

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return count;
    }

    public void mergeSort(int[] nums, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);

            countPairs(nums, low, mid, high);
            merge(nums, low, mid, high);
        }
    }

    public void merge(int[] nums, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;
        int k = 0;

        int temp[] = new int[high - low + 1];

        while (left <= mid && right <= high) {

            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= high) {
            temp[k++] = nums[right++];
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }

    public void countPairs(int[] nums, int low, int mid, int high) {

        int right = mid + 1;

        for (int i = low; i <= mid; i++) {

            while (right <= high &&
                    nums[i] > nums[right] * 2L) {

                right++;
            }

            count += right - (mid + 1);
        }
    }

    public static void main(String[] args) {

        CountReversePairs obj = new CountReversePairs();

        int[] nums = {1, 3, 2, 3, 1};

        int result = obj.reversePairs(nums);

        System.out.println("Reverse Pairs: " + result);
    }
}