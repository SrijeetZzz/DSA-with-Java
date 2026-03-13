package Arrayproblems;

import java.util.ArrayList;

/*
Problem Statement:
A self-dividing number is a number that is divisible by every digit it contains.
Return a list of all self-dividing numbers in the range [left, right].

A number is self-dividing if:
1. It does not contain digit 0.
2. It is divisible by each of its digits.

Input:
int left → starting number
int right → ending number

Output:
ArrayList<Integer> → list of all self-dividing numbers in range

Example:
Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

Explanation:
12 → divisible by 1 and 2
15 → divisible by 1 and 5
22 → divisible by 2 and 2

Approach:
1. Loop from left to right.
2. For each number, check if it is self-dividing.
3. Extract digits using %10.
4. If digit == 0 → not valid.
5. If number % digit != 0 → not valid.
6. If all digits valid → add to list.

Time Complexity: O(n × d)
n = range size
d = number of digits

Space Complexity: O(k)
k = number of valid self dividing numbers
*/

public class SelfDividingNumbers {

    public static void main(String[] args){

        int left = 1;
        int right = 22;

        SelfDividingNumbers obj = new SelfDividingNumbers();

        ArrayList<Integer> result =
                obj.selfDividingNumbers(left, right);

        System.out.println(result);
    }


    public ArrayList<Integer> selfDividingNumbers(int left, int right) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = left; i <= right; i++){

            if(getNum(i)){
                arr.add(i);
            }
        }

        return arr;
    }


    public boolean getNum(int num){

        int originalNum = num;

        while(num > 0){

            int digit = num % 10;

            if(digit == 0 || originalNum % digit != 0){
                return false;
            }

            num = num / 10;
        }

        return true;
    }
}