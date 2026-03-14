package Miscellaneous;

public class StringIntCharTypeCasting {
    public static void main(String[] args) {

        // ========= CHAR → INT =========

        char c1 = '7';

        int x1 = c1 - '0';
        System.out.println(x1);
        // Output: 7
        // Returns: numeric value of digit char

        int x2 = (int) c1;
        System.out.println(x2);
        // Output: 55
        // Returns: ASCII value of '7'



        // ========= INT → CHAR =========

        int n1 = 7;

        char c2 = (char)(n1 + '0');
        System.out.println(c2);
        // Output: '7'
        // Returns: digit char from number

        int ascii = 65;
        char c3 = (char) ascii;
        System.out.println(c3);
        // Output: A
        // Returns: char from ASCII



        // ========= CHAR → STRING =========

        char c4 = 'A';

        String s1 = String.valueOf(c4);
        System.out.println(s1);
        // Output: A
        // Returns: string from char

        String s2 = c4 + "";
        System.out.println(s2);
        // Output: A
        // Returns: string from char



        // ========= STRING → CHAR =========

        String s3 = "Hello";

        char c5 = s3.charAt(0);
        System.out.println(c5);
        // Output: H
        // Returns: char at index



        // ========= STRING → INT =========

        String s4 = "123";

        int x3 = Integer.parseInt(s4);
        System.out.println(x3);
        // Output: 123
        // Returns: int from string

        Integer x4 = Integer.valueOf(s4);
        System.out.println(x4);
        // Output: 123
        // Returns: Integer object



        // ========= INT → STRING =========

        int n2 = 456;

        String s5 = Integer.toString(n2);
        System.out.println(s5);
        // Output: "456"
        // Returns: string from int

        String s6 = String.valueOf(n2);
        System.out.println(s6);
        // Output: "456"
        // Returns: string from int



        // ========= STRING → CHAR ARRAY =========

        String s7 = "abc";

        char[] arr = s7.toCharArray();
        System.out.println(arr[1]);
        // Output: b
        // Returns: char array



        // ========= CHAR ARRAY → STRING =========

        char[] arr2 = {'h','i'};

        String s8 = new String(arr2);
        System.out.println(s8);
        // Output: hi
        // Returns: string from char[]



        // ========= INT → CHAR (alphabet) =========

        int n3 = 0;

        char c6 = (char) ('a' + n3);
        System.out.println(c6);
        // Output: a
        // Returns: alphabet from index



        // ========= CHAR → INT (alphabet index) =========

        char c7 = 'c';

        int x5 = c7 - 'a';
        System.out.println(x5);
        // Output: 2
        // Returns: index of alphabet
    }
}

