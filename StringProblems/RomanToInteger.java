package StringProblems;

import java.util.HashMap;

/*
Problem Statement:
Convert a Roman numeral string into an integer.

Roman symbols:

I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000

Special rule:
If a smaller value comes before a bigger value → subtract

Examples:
IV = 4
IX = 9
XL = 40
XC = 90
CM = 900

Input:
String s

Output:
int

Example 1:
Input: "III"
Output: 3

Example 2:
Input: "IV"
Output: 4

Example 3:
Input: "MCMXCIV"
Output: 1994

------------------------------------------------

Approach

1. Store roman values in HashMap
2. Traverse string from left to right
3. Compare current and next value
4. If current < next → subtract
5. Else → add
6. Add last character separately

------------------------------------------------

Algorithm

num = 0

for i = 0 to n-2
    if value[i] < value[i+1]
        num -= value[i]
    else
        num += value[i]

add last value

return num

------------------------------------------------

Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
*/

public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<Character, Integer> hm =
                new HashMap<Character, Integer>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int n = s.length();

        int num = 0;

        for (int i = 0; i < n - 1; i++) {

            if (hm.get(s.charAt(i)) >
                    hm.get(s.charAt(i + 1))) {

                num += hm.get(s.charAt(i));

            } else {

                num -= hm.get(s.charAt(i));
            }
        }

        return num + hm.get(s.charAt(n - 1));
    }

    public static void main(String[] args) {

        RomanToInteger obj =
                new RomanToInteger();

        String s1 = "III";
        String s2 = "IV";
        String s3 = "MCMXCIV";

        System.out.println(obj.romanToInt(s1));
        System.out.println(obj.romanToInt(s2));
        System.out.println(obj.romanToInt(s3));
    }
}