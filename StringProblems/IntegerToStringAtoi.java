package StringProblems;

/*
Problem Statement:
Implement the myAtoi() function which converts a string to a 32-bit signed integer.

Rules:
1. Ignore leading spaces
2. Check sign (+ or -)
3. Read digits until non-digit
4. Handle overflow (between Integer.MIN_VALUE and Integer.MAX_VALUE)
5. Return integer value

Input:
String s

Output:
int

Example 1:
Input: "42"
Output: 42

Example 2:
Input: "   -42"
Output: -42

Example 3:
Input: "4193 with words"
Output: 4193

Example 4:
Input: "91283472332"
Output: 2147483647

------------------------------------------------

Approach

1. Trim spaces
2. Check sign
3. Convert digits one by one
4. Stop at non-digit
5. Check overflow
6. Return result

------------------------------------------------

Algorithm

trim string

flag = 1

if '-' → flag = -1
if '+' → move forward

num = 0

for each char:
    if digit:
        num = num*10 + digit
        check overflow
    else break

return num * flag

------------------------------------------------

Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
*/

public class IntegerToStringAtoi {

    public int myAtoi(String input) {

        String str = input.trim();

        if (str.length() == 0) return 0;

        int flag = 1;
        int start = 0;

        if (str.charAt(start) == '-') {
            flag = -1;
            start++;
        } else if (str.charAt(start) == '+') {
            start++;
        }

        int n = str.length();

        long num = 0;

        for (int i = start; i < n; i++) {

            char c = str.charAt(i);

            if (Character.isDigit(c)) {

                int digit = c - '0';

                num = num * 10 + digit;

                if (flag == 1 && num > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;

                if (flag == -1 && -num < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;

            } else {
                break;
            }
        }

        return (int) (num * flag);
    }


    // -------- main method --------
    public static void main(String[] args) {

        IntegerToStringAtoi obj =
                new IntegerToStringAtoi();

        String s1 = "42";
        String s2 = "   -42";
        String s3 = "4193 with words";
        String s4 = "91283472332";

        System.out.println(obj.myAtoi(s1));
        System.out.println(obj.myAtoi(s2));
        System.out.println(obj.myAtoi(s3));
        System.out.println(obj.myAtoi(s4));
    }
}