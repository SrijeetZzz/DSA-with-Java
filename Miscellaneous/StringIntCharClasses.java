package Miscellaneous;

public class StringIntCharClasses {
    public static void main(String[] args) {

        // ================= STRING =================

        String s = "  Hello123 World  ";

        System.out.println(s.length());
        // Output: 18
        // Returns: number of characters in string

        System.out.println(s.charAt(2));
        // Output: H
        // Returns: character at given index

        System.out.println(s.substring(2,7));
        // Output: Hello
        // Returns: part of string from start to end-1

        System.out.println(s.contains("Hello"));
        // Output: true
        // Returns: true if substring exists

        System.out.println(s.indexOf("o"));
        // Output: 6
        // Returns: index of first occurrence

        System.out.println(s.toLowerCase());
        // Output:   hello123 world  
        // Returns: new string in lowercase

        System.out.println(s.toUpperCase());
        // Output:   HELLO123 WORLD  
        // Returns: new string in uppercase

        System.out.println(s.trim());
        // Output: Hello123 World
        // Returns: string without leading/trailing spaces

        String[] parts = s.trim().split(" ");
        System.out.println(parts[0]);
        // Output: Hello123
        // Returns: array of strings after split

        char[] arr = s.trim().toCharArray();
        System.out.println(arr[0]);
        // Output: H
        // Returns: char array of string

        String numStr = String.valueOf(100);
        System.out.println(numStr);
        // Output: 100
        // Returns: string representation of value



        // ================= CHARACTER =================

        char c = 'A';
        char d = '5';
        char sp = ' ';

        System.out.println(Character.isLetter(c));
        // Output: true
        // Returns: true if alphabet

        System.out.println(Character.isDigit(d));
        // Output: true
        // Returns: true if digit

        System.out.println(Character.isLetterOrDigit(d));
        // Output: true
        // Returns: true if letter or digit

        System.out.println(Character.toLowerCase(c));
        // Output: a
        // Returns: lowercase character

        System.out.println(Character.toUpperCase('b'));
        // Output: B
        // Returns: uppercase character

        System.out.println(Character.isWhitespace(sp));
        // Output: true
        // Returns: true if space/tab/newline

        System.out.println(Character.getNumericValue('7'));
        // Output: 7
        // Returns: numeric value of char



        // ================= INTEGER =================

        String n = "123";

        int x = Integer.parseInt(n);
        System.out.println(x);
        // Output: 123
        // Returns: int from string

        String s2 = Integer.toString(45);
        System.out.println(s2);
        // Output: 45
        // Returns: string from int

        System.out.println(Integer.MAX_VALUE);
        // Output: 2147483647
        // Returns: maximum int value

        System.out.println(Integer.MIN_VALUE);
        // Output: -2147483648
        // Returns: minimum int value

        System.out.println(Integer.bitCount(5));
        // Output: 2
        // Returns: number of set bits

        System.out.println(Integer.compare(3,5));
        // Output: -1
        // Returns: negative if first < second

        Integer obj = Integer.valueOf("10");
        System.out.println(obj);
        // Output: 10
        // Returns: Integer object from string
    }
}

