package StringProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
Problem Statement:
Given a string s, sort the characters in decreasing order
based on the frequency of characters.

If two characters have same frequency,
sort them in alphabetical order.

Input:
String s

Output:
List<Character> sorted by frequency

Example:
Input: "tree"

Frequency:
t → 1
r → 1
e → 2

Output:
[e, r, t]

------------------------------------------------

Approach

1. Count frequency using HashMap
2. Store characters in list
3. Sort list using custom comparator
4. Sort by:
   higher frequency first
   if same → alphabetical order
5. Return sorted list

------------------------------------------------

Algorithm

create map

for each char
    count++

make list of keys

sort list:
    compare freq
    if equal → compare char

return list

------------------------------------------------

Time Complexity: O(n log n)
Space Complexity: O(n)

------------------------------------------------
*/

public class SortCharacterByFreq {

    public List<Character> frequencySort(String s) {

        HashMap<Character, Integer> hm =
                new HashMap<Character, Integer>();

        for (char ch : s.toCharArray()) {

            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        List<Character> arrList =
                new ArrayList<Character>(hm.keySet());

        Collections.sort(arrList, (a, b) -> {

            int countA = hm.get(a);
            int countB = hm.get(b);

            if (countA != countB) {

                return countB - countA;

            } else {

                return a - b;
            }
        });

        return arrList;
    }


    // -------- main method --------
    public static void main(String[] args) {

        SortCharacterByFreq obj =
                new SortCharacterByFreq();

        String s = "tree";

        List<Character> result =
                obj.frequencySort(s);

        System.out.println(result);
    }
}