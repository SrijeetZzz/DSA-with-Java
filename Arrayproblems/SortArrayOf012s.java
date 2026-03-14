package Arrayproblems;

import java.util.Arrays;

/*
Problem Statement:
Given an array containing only 0s, 1s and 2s,
sort the array in ascending order without using built-in sort.

Input:
int[] nums

Output:
Sorted array in-place

Example:
Input:  [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

------------------------------------------------
Approach 1 : Dutch National Flag Algorithm
------------------------------------------------
Use 3 pointers:
low → position for 0
mid → current
high → position for 2

if nums[mid] == 0 → swap(low, mid)
if nums[mid] == 1 → mid++
if nums[mid] == 2 → swap(mid, high)

Time: O(n)
Space: O(1)

------------------------------------------------
Approach 2 : Counting
------------------------------------------------
Count number of 0s,1s,2s
Rewrite array using counts

Time: O(n)
Space: O(1)
*/

public class SortArrayOf012s {


    public void sortZeroOneTwo(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                swap(nums, low, mid);
                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void sortByCounting(int[] nums) {

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int x : nums) {

            if (x == 0) c0++;
            else if (x == 1) c1++;
            else c2++;
        }
        int i = 0;
        while (c0 != 0) {
            nums[i] = 0;
            i++;
            c0--;   
        }
        while (c1 != 0) {
            nums[i] = 1;
            i++;
            c1--;   
        }
        while (c2 != 0) {
            nums[i] = 2;
            i++;
            c2--;   
        }
    }

    public void swap(int[] nums, int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    public static void main(String[] args) {

        SortArrayOf012s obj = new SortArrayOf012s();

        int[] arr1 = {2,0,2,1,1,0};

        System.out.println("Original : " + Arrays.toString(arr1));

        obj.sortZeroOneTwo(arr1);

        System.out.println("DutchFlag : " + Arrays.toString(arr1));


        int[] arr2 = {2,1,0,2,0,1,1};

        obj.sortByCounting(arr2);

        System.out.println("Counting : " + Arrays.toString(arr2));
    }
}