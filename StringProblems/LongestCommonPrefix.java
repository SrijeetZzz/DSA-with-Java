package StringProblems;

/*
Problem Statement:
Write a function to find the longest common prefix
string amongst an array of strings.

If there is no common prefix, return "".

Input:
String[] strs

Output:
String → longest common prefix

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""

------------------------------------------------

Approach (Horizontal Scanning)

1. Take first string as prefix.
2. Compare prefix with next string.
3. Update prefix = common prefix.
4. Repeat for all strings.
5. Return final prefix.

We compare two strings using helper function.

------------------------------------------------

Algorithm

prefix = first string

for each string:
    prefix = common(prefix, string)

return prefix

------------------------------------------------

Time Complexity: O(n * m)
n = number of strings
m = length of smallest string

Space Complexity: O(m)

------------------------------------------------
*/

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] str) {

        if (str == null || str.length == 0) return "";

        int n = str.length;

        String s1 = str[0];

        for (int i = 1; i < n; i++) {

            s1 = calCommonPrefix(s1, str[i]);
        }

        return s1;
    }


    public String calCommonPrefix(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        int l = Math.min(m, n);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < l; i++) {

            if (s1.charAt(i) == s2.charAt(i)) {

                sb.append(s1.charAt(i));

            } else {

                break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        LongestCommonPrefix obj = new LongestCommonPrefix();

        String[] arr = {"flower", "flow", "flight"};

        String result = obj.longestCommonPrefix(arr);

        System.out.println("Longest Prefix = " + result);
    }
}