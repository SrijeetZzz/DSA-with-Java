package StringProblems;

import java.util.HashMap;

/*
Problem Statement:
Given two strings s and t, determine if t is an anagram of s.

An anagram means both strings contain the same characters
with the same frequency, but possibly in different order.

Input:
String s
String t

Output:
true  → if both strings are anagrams
false → otherwise

Example:
Input:  s = "listen", t = "silent"
Output: true

Input:  s = "rat", t = "car"
Output: false

Approach:
1. If lengths are different → cannot be anagram.
2. Use HashMap<Character, Integer> to store frequency of characters.
3. Traverse string s and count each character.
4. Traverse string t and decrease the count.
5. If any character not found → return false.
6. If count becomes 0 → remove from map.
7. If map becomes empty → valid anagram.

Key Points:
- Both strings must have same length.
- Frequency of every character must match.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ValidAnagram {

    public boolean anagramStrings(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            if(hm.containsKey(t.charAt(i))){
                hm.put(t.charAt(i), hm.get(t.charAt(i)) - 1);

                if(hm.get(t.charAt(i)) == 0){
                    hm.remove(t.charAt(i));
                }
            }
            else{
                return false;
            }
        }

        return hm.isEmpty();
    }

    public static void main(String[] args) {

        ValidAnagram obj = new ValidAnagram();

        String s = "listen";
        String t = "silent";

        boolean result = obj.anagramStrings(s, t);

        System.out.println(result);
    }
}