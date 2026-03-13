package Arrayproblems;

/*
Problem Statement:
Given an array of integers, count the number of inversions in the array.

An inversion is defined as:
i < j and nums[i] > nums[j]

Input:
Integer array nums

Output:
Integer → number of inversions

Example:
Input:  [2,4,1,3,5]
Output: 3

Explanation:
Inversions are:
(2,1), (4,1), (4,3)

Approach:
1. Use Merge Sort to divide the array.
2. While merging two sorted halves, count inversions.
3. If element from right half is smaller than left half,
   then all remaining elements in left half form inversions.
4. Add (mid - left + 1) to count.
5. Continue merge normally.

Why Merge Sort?
Brute force → O(n^2)
Merge sort → O(n log n)

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

public class InverseCount {
    
    public static int count = 0;

    static int inversionCount(int nums[]) {
        count = 0;
        mergeSort(nums,0,nums.length-1); 
        return count;
    }

    static void mergeSort(int [] nums,int low,int high){
        if(low < high){
            int mid = (low + high) / 2;

            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);

            merge(nums,low,mid,high);
        }
    }

    static void merge(int[] nums,int low,int mid,int high){

        int left = low;
        int right = mid + 1;
        int k = 0;

        int temp[] = new int[high - low + 1];

        while(left <= mid && right <= high){

            if(nums[left] <= nums[right]){
                temp[k++] = nums[left++];
            }
            else{
                temp[k++] = nums[right++];
                count += (mid - left + 1);
            }
        }

        while(left <= mid){
            temp[k++] = nums[left++];
        }

        while(right <= high){
            temp[k++] = nums[right++];
        }

        for(int i = low; i <= high; i++){
            nums[i] = temp[i - low];
        }
    }

    public static void main(String[] args) {

        int[] nums = {2,4,1,3,5};

        int result = inversionCount(nums);

        System.out.println("Inversion Count: " + result);

    }
}