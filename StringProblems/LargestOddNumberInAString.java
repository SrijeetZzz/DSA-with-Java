package StringProblems;

/*
Problem Statement:
You are given a numeric string s.
Return the largest odd-numbered substring of s.

A substring is odd if its last digit is odd.

If no odd number exists, return "".

Input:
String s

Output:
String → largest odd substring

Example 1:
Input: "52"
Output: "5"

Example 2:
Input: "4206"
Output: ""

Example 3:
Input: "35427"
Output: "35427"

------------------------------------------------

Approach

1. Find first non-zero digit → start
2. Find last odd digit from right → end
3. Return substring(start, end+1)

Why?
Largest odd number must end at last odd digit.

------------------------------------------------

Algorithm

1. start = first non-zero index
2. end = last odd digit index
3. if not found → return ""
4. return substring(start, end+1)

------------------------------------------------

Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
*/

public class LargestOddNumberInAString {

    public String largeOddNum(String s) {

        int n = s.length();

        int start = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) != '0') {

                start = i;
                break;
            }
        }

        if (start == -1) return "";

        for (int i = n - 1; i >= start; i--) {

            int num = s.charAt(i) - '0';

            if (num % 2 != 0) {

                end = i;
                break;
            }
        }

        if (end == -1) return "";

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {

        LargestOddNumberInAString obj =
                new LargestOddNumberInAString();

        String s = "35427";

        String result = obj.largeOddNum(s);

        System.out.println("Largest Odd = " + result);
    }
}