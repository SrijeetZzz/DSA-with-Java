package Arrayproblems;

import java.util.HashMap;

/*
Problem Statement:
Find the number of subarrays whose sum is equal to k.

Input:
int[] nums
int k

Output:
Return count of subarrays whose sum = k

Example:
Input:
nums = [1,1,1]
k = 2

Output:
2

Explanation:
Subarrays:
[1,1] (index 0-1)
[1,1] (index 1-2)

------------------------------------------------

Algorithm (Prefix Sum + HashMap)

1. Maintain running sum.
2. If (sum - k) existed before,
   then subarray sum = k exists.
3. Store prefix sum frequency in map.
4. Add frequency to count.

Why hm.put(0,1)?

It means:
sum = k from start index.

Example:
[3] , k = 3

------------------------------------------------

Steps:

sum = 0
count = 0

for each num:
    sum += num

    if map contains (sum - k)
        count += frequency

    store sum in map

------------------------------------------------

Time Complexity: O(n)
Space Complexity: O(n)

Works for:
✔ positive
✔ negative
✔ zero
✔ mixed
*/

public class CountSubarrayWithSumK {

    public static int countSubarrays(int[] nums, int k) {

        int n = nums.length;

        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(0, 1);

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (hm.containsKey(sum - k)) {

                count += hm.get(sum - k);
            }

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        return count;
    }


    // ---------- main method ----------
    public static void main(String args[]) {

        int[] nums = {1, 1, 1};

        int k = 2;

        int result = countSubarrays(nums, k);

        System.out.println("Count = " + result);
    }
}