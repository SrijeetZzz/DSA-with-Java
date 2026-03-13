package Arrayproblems;

/*
Problem Statement:
Given an integer array nums, find the GCD (Greatest Common Divisor)
of the smallest element and the largest element in the array.

Input:
Integer array nums

Output:
Integer → GCD of minimum and maximum element

Example:
Input:  [2,5,6,9,10]
Min = 2
Max = 10
GCD(2,10) = 2

Approach:
1. Traverse the array to find the maximum element.
2. Traverse the array to find the minimum element.
3. Use Euclidean Algorithm to find GCD of min and max.
4. Return the GCD.

Euclidean Algorithm:
gcd(a, b) = gcd(b % a, a) until a becomes 0

Time Complexity:
O(n) for finding min
O(n) for finding max
O(log n) for gcd
Overall → O(n)

Space Complexity:
O(1)
*/

public class GCDinArray {

    public static void main(String[] args) {

        int[] nums = {2,5,6,9,10};

        GCDinArray obj = new GCDinArray();

        int result = obj.findGCD(nums);

        System.out.println("GCD of min and max element: " + result);
    }

    public int findGCD(int[] nums) {

        int maxElement = getMax(nums);
        int minElement = getMin(nums);

        return gcd(minElement, maxElement);
    }

    public int getMax(int[] nums){

        int max = Integer.MIN_VALUE;

        for(int num : nums){
            if(num >= max){
                max = num;
            }
        }

        return max;
    }

    public int getMin(int[] nums){

        int min = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= min){
                min = num;
            }
        }

        return min;
    }

    public int gcd(int a, int b){

        while(a != 0){

            int temp = b % a;
            b = a;
            a = temp;
        }

        return b;
    }
}