package Arrayproblems;

import java.util.HashSet;

/*
Problem Statement:
Given an integer array nums, remove the duplicate elements and return
the number of unique elements present in the array.

Input:
int[] nums → array of integers (may contain duplicates)

Output:
Integer → number of unique elements in the array

Example:
Input:  [1,1,2,2,3,4]
Output: 4

Explanation:
Unique elements are {1,2,3,4} → total = 4

Approach:
1. Create a HashSet to store unique elements.
2. Traverse the array and insert each element into the HashSet.
3. Since a HashSet automatically removes duplicates,
   it will only store unique values.
4. Return the size of the HashSet.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int x : nums)
            hs.add(x);

        return hs.size();
    }

    public static void main(String[] args) {

        RemoveDuplicates obj = new RemoveDuplicates();

        int[] arr = {1,1,2,2,3,4};

        System.out.println(obj.removeDuplicates(arr));
    }
}