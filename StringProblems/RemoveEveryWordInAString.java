package StringProblems;

/*
Problem Statement:
Given a string s, reverse the order of words in the string.

A word is defined as a sequence of non-space characters.
The returned string should contain the words in reverse order
separated by a single space, with no leading or trailing spaces.

Input:
String s

Output:
String → words of the string reversed

Example:
Input:  "  hello   world java  "
Output: "java world hello"

Explanation:
Extra spaces are removed and the order of words is reversed.

Approach:
1. Remove leading and trailing spaces using trim().
2. Split the string using regex "\\s+" which handles multiple spaces.
3. Traverse the array of words from the end to the beginning.
4. Append each word to a StringBuilder with a space.
5. Trim the final result to remove the trailing space.

Key Points:
- trim() removes extra spaces at the start and end.
- "\\s+" splits based on one or more whitespace characters.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class RemoveEveryWordInAString {

    public String reverseWords(String s) {

        String str = s.trim();
        String[] strArr = str.split("\\s+");

        int n = strArr.length;

        StringBuilder sb = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            String st = strArr[i];
            sb.append(st).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {

        RemoveEveryWordInAString obj = new RemoveEveryWordInAString();

        String input = "  hello   world java  ";

        String result = obj.reverseWords(input);

        System.out.println(result);
    }
}