package StringProblems;

/*
Problem Statement:
Given a string s, reverse the order of words in the string.

A word is defined as a sequence of non-space characters.
The result should contain words in reverse order separated by a single space.
Leading, trailing, and multiple spaces between words should be removed.

Input:
String s

Output:
String → words of the string reversed

Example:
Input:  "  the sky   is blue  "
Output: "blue is sky the"

Explanation:
The words are reversed and extra spaces are removed.

Approach:
1. Remove leading and trailing spaces using trim().
2. Split the string into words using regex "\\s+" which handles multiple spaces.
3. Traverse the array of words from end to beginning.
4. Append each word to a StringBuilder followed by a space.
5. Trim the final string to remove the trailing space.

Key Points:
- trim() removes unnecessary spaces at the beginning and end.
- "\\s+" ensures multiple spaces are treated as a single delimiter.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ReverseEveryWordInAString {

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

        ReverseEveryWordInAString obj = new ReverseEveryWordInAString();

        String input = "  the sky   is blue  ";

        String result = obj.reverseWords(input);

        System.out.println(result);
    }
}