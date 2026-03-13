package StringProblems;

import java.util.HashMap;

/*
Problem Statement:
Two strings s and t are isomorphic if the characters in s
can be replaced to get t.

Each character in s must map to exactly one character in t,
and no two characters may map to the same character.

Input:
String s
String t

Output:
true  → if strings are isomorphic
false → otherwise

Example 1:
Input:  s = "egg", t = "add"
Output: true

Example 2:
Input:  s = "foo", t = "bar"
Output: false

Example 3:
Input:  s = "paper", t = "title"
Output: true

Approach:
1. If lengths are different → not isomorphic.
2. Use HashMap<Character, Character> to store mapping.
3. Traverse both strings together.
4. If character already exists in map:
      check if mapped value is same.
      if not → return false.
5. If character not in map:
      check if value already mapped to another key.
      (use containsValue to avoid many-to-one mapping)
6. Store mapping.
7. If loop completes → strings are isomorphic.

Key Points:
- One-to-one mapping required.
- No two characters should map to same character.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class IsomorphicString {

    public boolean isomorphicString(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Character> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (hm.containsKey(s.charAt(i))) {

                if (hm.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }

            } else {

                if (hm.containsValue(t.charAt(i))) {
                    return false;
                }

                hm.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }

    public static void main(String[] args) {

        IsomorphicString obj = new IsomorphicString();

        String s1 = "egg";
        String t1 = "add";

        String s2 = "foo";
        String t2 = "bar";

        System.out.println(obj.isomorphicString(s1, t1)); // true
        System.out.println(obj.isomorphicString(s2, t2)); // false
    }
}